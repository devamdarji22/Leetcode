// 🧩 Problem: Count Good Nodes in Binary Tree
// 🔗 Link   : https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

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
    int goodNode = 1;
    public int goodNodes(TreeNode root) {
        getGoodNode(root.left, root.val);
        getGoodNode(root.right, root.val);
        return goodNode;
    }
    void getGoodNode(TreeNode node, int grtNum){
        if(node == null) return;
        if(node.val >= grtNum) goodNode++;
        grtNum = Math.max(grtNum, node.val);
        getGoodNode(node.left, grtNum);
        getGoodNode(node.right, grtNum);
    }
}