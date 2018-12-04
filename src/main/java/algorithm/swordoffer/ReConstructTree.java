package algorithm.swordoffer;

/**
 * 重建二叉树，递归是解决问题的关键思路
 *
 * @author evilhex.
 * @date 2018/11/13 1:00 PM.
 */
public class ReConstructTree {

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode node = null;
        if (pre == null || in == null) {
            return null;
        }
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
        return constructTree(pre, 0, pre.length - 1, in, 0, in.length - 1, map);
    }

    static TreeNode constructTree(int[] pre, int prei, int prej, int[] in, int ini, int inj, java.util.HashMap<Integer, Integer> map) {
        // 递归结束条件
        if (prei > prej) {
            return null;
        }
        TreeNode root = new TreeNode(pre[prei]);
        int middle = map.get(pre[prei]);
        root.left = constructTree(pre, prei + 1, prei + middle - ini, in, ini, middle - 1, map);
        root.right = constructTree(pre, prei + middle - ini + 1, prej, in, middle + 1, inj, map);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(pre, in);
    }
}
