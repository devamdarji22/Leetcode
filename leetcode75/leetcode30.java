// 🧩 Problem: Odd Even Linked List
// 🔗 Link   : https://leetcode.com/problems/odd-even-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode secondHead = head.next;
        ListNode curr1 = head, curr2 = head.next;
        while(curr2 != null && curr2.next != null){
            ListNode temp1 = curr1.next.next;
            ListNode temp2 = curr2.next.next;
            curr1.next = curr1.next.next;
            curr2.next = curr2.next.next;
            curr1 = temp1;
            curr2 = temp2;
        }
        curr1.next = secondHead;
        return head;
    }
}