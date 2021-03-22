/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 递归出口
        if (head == null || head.next == null) return head;
        // 不能只将头节点作为迭代器，需要引入额外变量
        ListNode first = head;
        ListNode second = head.next;
        // 使用两个节点作为迭代器
        while(second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        return first;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        // 考虑执行完递归后，如何合并子问题
        ListNode tail = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }
}