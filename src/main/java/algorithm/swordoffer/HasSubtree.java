package algorithm.swordoffer;

/**
 * 树的子结构
 *
 * @Author: evilhex
 * @Date: 2018-12-10 11:17
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = DoesTree1HasTree2(root1, root2);
            }
            if (!result) {
                HasSubtree(root1.left, root2);
            }
            if (!result) {
                HasSubtree(root1.right, root2);
            }
        }
        return result;
    }

    public boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
    }
}
