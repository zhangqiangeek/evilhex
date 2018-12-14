package algorithm.swordoffer;

/**
 * 复制复杂链表
 *
 * @Author: evilhex
 * @Date: 2018-12-14 10:46
 */
public class CloneList {

    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        // 原节点后边添加一个节点
        while (pNode != null) {
            RandomListNode cloneNode = new RandomListNode(pNode.label);
            cloneNode.next = pNode.next;
            pNode.next = cloneNode;
            pNode = pNode.next.next;
        }
        // 复制随机节点
        pNode = pHead;
        while (pNode != null) {
            RandomListNode cloneNode = pNode.next;
            if (pNode.random != null) {
                cloneNode.random = pNode.random.next;
            }
            pNode = cloneNode.next;

        }
        // 拆分链表
        pNode = pHead;
        RandomListNode cloneHead = pNode.next;
        RandomListNode cloneNode = cloneHead;
        while (pNode != null) {
            pNode.next = pNode.next.next;
            cloneNode.next = cloneNode.next.next;
            pNode = pNode.next;
            cloneHead = cloneNode.next;
        }
        return cloneHead;
    }
}

/**
 * 复杂链表节点
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}