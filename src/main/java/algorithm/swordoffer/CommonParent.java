package algorithm.swordoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个节点的最近公共祖先
 *
 * @Author: evilhex
 * @Date: 2018-12-18 16:50
 */
public class CommonParent {
    public static TreeNode getLastCommonParent(TreeNode root, TreeNode p1, TreeNode p2) {
        //path1和path2分别存储根节点到p1和p2的路径（不包括p1和p2）
        List<TreeNode> path1 = new ArrayList<TreeNode>();
        List<TreeNode> path2 = new ArrayList<TreeNode>();
        List<TreeNode> tmpList = new ArrayList<TreeNode>();

        getNodePath(root, p1, tmpList, path1);
        getNodePath(root, p2, tmpList, path2);
        //如果路径不存在，返回空
        if (path1.size() == 0 || path2.size() == 0)
            return null;

        return getLastCommonParent(path1, path2);
    }

    // 获取根节点到目标节点的路径
    public static void getNodePath(TreeNode root, TreeNode target, List<TreeNode> tmpList, List<TreeNode> path) {
        if (root == null || root == target) {
            return;
        }
        tmpList.add(root);
        List<TreeNode> children = root.children;
        for (TreeNode node : children) {
            if (node == target) {
                path.addAll(tmpList);
                break;
            }
            getNodePath(node, target, tmpList, path);
        }
        tmpList.remove(tmpList.size() - 1);
    }

    //将问题转化为求链表最后一个共同节点
    private static TreeNode getLastCommonParent(List<TreeNode> p1, List<TreeNode> p2) {
        TreeNode tmpNode = null;
        for (int i = 0; i < p1.size(); i++) {
            if (p1.get(i) != p2.get(i))
                break;
            tmpNode = p1.get(i);
        }

        return tmpNode;
    }

    // 节点类
    private static class TreeNode {
        int val;
        List<TreeNode> children = new ArrayList<>();

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
