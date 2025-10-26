// 🧩 Problem: Delete Node in a BST
// 🔗 Link   : https://leetcode.com/problems/delete-node-in-a-bst/description/?envType=study-plan-v2&envId=leetcode-75

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        else if(root.val>key) {
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else {
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else {
                TreeNode succ = getSuccessor(root.right);
                root.val = succ.val;
                root.right = deleteNode(root.right, succ.val);
            }
        }
        return root;
    }

    TreeNode getSuccessor(TreeNode node){
        while(node != null && node.left != null){
            node = node.left;
        }
        return node;
    }
}