// 🧩 Problem: Letter Combinations of a Phone Number
// 🔗 Link   : https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    HashMap<Integer, String> map = new HashMap<>();
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        populateMap();
        if(digits.length()==0) return ans;
        solve(digits, 0, new StringBuilder());
        return ans;
    }
    void solve(String digits, int curr, StringBuilder sb){
        if(curr == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(curr)-'0');
        for(char c: letters.toCharArray()){
            sb.append(c);
            solve(digits, curr+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    void populateMap(){
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
}