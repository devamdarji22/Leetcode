// 🧩 Problem: Leaf-Similar Trees
// 🔗 Link   : https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafList1 = new ArrayList<>();
        ArrayList<Integer> leafList2 = new ArrayList<>();
        getLeafList(root1, leafList1);
        getLeafList(root2, leafList2);
        if(leafList1.size() != leafList2.size())
            return false;
        for(int i = 0;i<leafList1.size();i++){
            if(!leafList1.get(i).equals(leafList2.get(i)))
                return false;
        }
        return true;
    }
    void getLeafList(TreeNode node, ArrayList<Integer> leafList){
        if(node == null) return;
        if(node.left == null && node.right == null){
            leafList.add(node.val);
        }
        getLeafList(node.left, leafList);
        getLeafList(node.right, leafList);
    }
}