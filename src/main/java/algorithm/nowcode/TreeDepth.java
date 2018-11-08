package algorithm.nowcode;

/**
 * 判断是否是平衡二叉树
 * @author evilhex
 */
public class TreeDepth {
    /**
     * 返回树的深度
     * @param root
     * @return
     */
    static int TreeDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return left>right?left+1:right+1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null){
            return true;
        }
        if (Math.abs(TreeDepth(root.left)-TreeDepth(root.right))>1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);


    }

}
