// 🧩 Problem: Dota2 Senate
// 🔗 Link   : https://leetcode.com/problems/dota2-senate/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i<n;i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            }
            else {
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            if(rIndex < dIndex) radiant.add(rIndex + n);
            else dire.add(dIndex + n);
        }
        return radiant.size() > dire.size() ? "Radiant" : "Dire";
    }
}