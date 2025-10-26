// 🧩 Problem: Maximum Twin Sum of a Linked List
// 🔗 Link   : https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75

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
    public int pairSum(ListNode head) {
        // Find n
        int n = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            n++;
        }
        // Find middle element
        int i = 0;
        curr = head;
        while(i<n/2){
            curr = curr.next;
            i++;
        }
        // Reverse the second of linked list
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Compare and find maximum
        curr = head;
        int maxSum = 0;
        while(prev != null){
            maxSum = Math.max(maxSum, curr.val + prev.val);
            prev = prev.next;
            curr = curr.next;
        }
        return maxSum;
    }
}