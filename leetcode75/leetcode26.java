// 🧩 Problem: Decode String
// 🔗 Link   : https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String decodeString(String s) {
        int num = 0;
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currString = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9'){
                num = num * 10 + (int)(c-'0');
            }
            else if(c == '['){
                countStack.push(num);
                num = 0;
                stringStack.push(currString);
                currString = new StringBuilder();
            }
            else if(c == ']'){
                int repeatNum = countStack.pop();
                StringBuilder temp = currString;
                currString = stringStack.pop();
                while(repeatNum-- > 0){
                    currString.append(temp);
                }
            }
            else {
                currString.append(c);
            }
        }
        return currString.toString();
    }
}