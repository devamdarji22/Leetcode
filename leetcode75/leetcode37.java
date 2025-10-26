// 🧩 Problem: Longest ZigZag Path in a Binary Tree
// 🔗 Link   : https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

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
    int maxPath = 0;
    public int longestZigZag(TreeNode root) {
        if(root.left != null){
            dfs(root.left, 0, 1);
        }
        if(root.right != null) {
            dfs(root.right, 1, 1);
        }
        return maxPath;
    }
    private void dfs(TreeNode node, int dir, int currLength){
        if(node == null) return;
        maxPath = Math.max(maxPath, currLength);
        if(dir == 0) {
            if(node.right != null) dfs(node.right, 1, currLength + 1);
            if(node.left != null) dfs(node.left, 0, 1);
        }
        else {
            if(node.left != null) dfs(node.left, 0, currLength + 1);
            if(node.right != null) dfs(node.right, 1, 1);
        }
    }
}