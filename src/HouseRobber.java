public class HouseRobber {
    public int rob(int[] num) {
        int rob = 0;
        int dontRob = 0;
        for(int i = 0; i < num.length; i++) {
            int currRob = dontRob + num[i];
            dontRob = Math.max(dontRob, rob);
            rob = currRob;
        }
    return Math.max(rob, dontRob);
    }
}
