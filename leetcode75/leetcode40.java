// 🧩 Problem: Maximum Level Sum of a Binary Tree
// 🔗 Link   : https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int maxLevel = 0;
        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(sum>maxSum){
                maxLevel = level;
                maxSum = sum;
            }
            level++;
        }
        return maxLevel;
    }
}