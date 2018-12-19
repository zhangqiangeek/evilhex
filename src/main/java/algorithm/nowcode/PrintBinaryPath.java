package algorithm.nowcode;

import java.util.ArrayList;


/**
 * 打印数据路径，注意的是递归过程中状态的保存
 *
 * @author evilhex
 * Created by evilhex on 2018/3/16.
 */
public class PrintBinaryPath {
    /**
     * 查找一个树的路径
     *
     * @param root
     * @param target
     * @return
     */
    static public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return paths;
        }
        FindPaths(root, target, paths, path);
        for (ArrayList arrayList : paths) {
            System.out.println(arrayList.toArray());
        }
        return paths;
    }

    /**
     * 查找路径的实现
     *
     * @param root
     * @param target
     * @param path
     * @return
     */
    static void FindPaths(TreeNode root, int target, final ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path) {
        //如果为叶子节点，就判断当前的路径是否满足条件，递归的出口
        if (root.left == null && root.right == null) {
            path.add(root.val);
            int sum = 0;
            for (int i = 0; i < path.size(); i++) {
                sum += path.get(i);
            }
            if (sum == target) {
                paths.add(new ArrayList<Integer>(path));
            }
            path.remove(path.get(path.size() - 1));
            return;
        } else {
            path.add(root.val);
            //递归左孩子
            if (root.left != null) {
                FindPaths(root.left, target, paths, path);
            }
            //递归右孩子
            if (root.right != null) {
                FindPaths(root.right, target, paths, path);
            }
            path.remove(path.get(path.size() - 1));
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(12);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode3.left = null;
        treeNode4.right = treeNode4.left = null;
        treeNode5.right = treeNode5.left = null;

        FindPath(treeNode1, 22);
    }
}
