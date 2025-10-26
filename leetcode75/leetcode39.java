// 🧩 Problem: Binary Tree Right Side View
// 🔗 Link   : https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=leetcode-75

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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            ans.add(queue.peek().val);
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.right != null){
                    queue.add(node.right);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
            }
        }
        return ans;
    }
}