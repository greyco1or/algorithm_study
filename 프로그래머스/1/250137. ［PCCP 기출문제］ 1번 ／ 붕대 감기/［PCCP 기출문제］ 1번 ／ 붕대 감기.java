class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int bandageTime = bandage[0];
        int bandageHeal = bandage[1];
        int bandageAdditonalHeal = bandage[2];
        int continuousUse = 0;
        int userHealth = health;
        int attackIndex = 0;
        for(int i = 0; i < attacks[attacks.length-1][0] + 1; i++) {
            if(i == attacks[attackIndex][0]) {
                continuousUse = 0;
                userHealth -= attacks[attackIndex][1];
                attackIndex++;
                if(userHealth <= 0) {
                    userHealth = -1;
                    break;
                }
            } else {
                userHealth += bandageHeal;
                continuousUse++;
                if(continuousUse == bandageTime) {
                    userHealth += bandageAdditonalHeal;
                    continuousUse = 0;
                }
                if(userHealth > health) {
                    userHealth = health;
                }
            }
        }
        return userHealth;
    }
}