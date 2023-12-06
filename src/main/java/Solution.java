public class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int fullWeeks = n / 7;
        int extraDays = n % 7;
        int i = fullWeeks;
        while(i != 0){
            total += 28 + (i -1) * 7;
            i--;
        }
        for(int j = 1; j <= extraDays; j++){
            total += j + fullWeeks;
        }
        return total;
    }
}
