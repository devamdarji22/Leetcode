// 🧩 Problem: Search Suggestions System
// 🔗 Link   : https://leetcode.com/problems/search-suggestions-system/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> suggestion = new ArrayList<>();
    }

    TrieNode root = new TrieNode();

    private void insert(String product) {
        TrieNode node = root;
        for (char c : product.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
            if(node.suggestion.size() < 3){
                node.suggestion.add(product);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for(String product: products){
            insert(product);
        }
        List<List<String>> result = new ArrayList<>();
        TrieNode node = root;
        for(char c: searchWord.toCharArray()){
            if(node != null)
                node = node.children[c-'a'];
            if(node != null)
                result.add(node.suggestion);
            else
                result.add(new ArrayList<>());
        }
        return result;
    }
}