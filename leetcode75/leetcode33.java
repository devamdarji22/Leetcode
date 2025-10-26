// 🧩 Problem: Maximum Depth of Binary Tree
// 🔗 Link   : https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        depth(root, 0);
        return maxDepth;
    }
    private void depth(TreeNode node, int level){
        if(node == null) {
            maxDepth = Math.max(maxDepth, level);
            return;
        }
        depth(node.left, level + 1);
        depth(node.right, level + 1);
    }
}