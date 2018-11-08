package algorithm.nowcode;

import java.util.LinkedList;

/**
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 *
 * @author evilhex.
 * @date 2018/7/9 下午5:14.
 */
public class TreePrinter {

    public static void printAndSave(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        //记录每一层的最右边的节点
        TreeNode last;
        //记录刚进入队列的节点
        TreeNode clast;
        //记录当前节点出队节点
        TreeNode current;
        if (root != null) {
            last = clast = root;
            queue.offer(root);
            while (!queue.isEmpty()) {
                current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                    clast = current.left;
                }
                if (current.right != null) {
                    queue.offer(current.right);
                    clast = current.right;
                }
                System.out.print(current.val);
                if (current.val == last.val) {
                    //换行打印
                    System.out.println("");
                    last = clast;
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = null;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode4.right = null;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode8;
        treeNode6.right = treeNode6.left = null;
        treeNode7.right = treeNode7.left = null;
        treeNode8.right = treeNode8.left = null;
        printAndSave(treeNode1);
    }
}
