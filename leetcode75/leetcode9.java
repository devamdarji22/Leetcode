// 🧩 Problem: String Compression
// 🔗 Link   : https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int compress(char[] chars) {
        int j = 0;
        for(int i = 0;i<chars.length;i++){
            int count = 1;
            chars[j] = chars[i];
            while(i+1<chars.length &&
                    chars[i+1] == chars[i]){
                count++;
                i++;
            }
            char[] countArray = Integer
                    .toString(count).toCharArray();
            if(count!=1){
                for(char c:countArray){
                    chars[++j] = c;
                }
            }
            j++;
        }
        return j;
    }
}