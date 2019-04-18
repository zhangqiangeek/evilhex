package algorithm.swordoffer.bak;

/**
 * 二叉搜索树转换成排序的双向链表:递归的思想
 *
 * @Author: evilhex
 * @Date: 2018-12-14 11:35
 */
public class TreeConvertList {
    TreeNode list = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        Convert(pRootOfTree.right);
        if (list == null) {
            list = pRootOfTree;
        } else {
            list.left = pRootOfTree;
            pRootOfTree.right = list;
            list = pRootOfTree;
        }
        Convert(pRootOfTree.left);

        return list;
    }
}
