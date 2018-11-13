package algorithm.swordoffer;

import java.util.ArrayList;

/**
 * 递归实现从尾到头打印链表,nowcoder运行通过
 *
 * @author evilhex.
 * @date 2018/11/13 12:40 PM.
 */
public class PrintList {
    public class Solution {
        /** 这个定义需要放到方法的外部，否则运行不通过 **/
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if (listNode != null) {
                this.printListFromTailToHead(listNode.next);
                arrayList.add(listNode.val);
            }
            return arrayList;
        }
    }
}
