public class LC0121 {
    public int maxProfit(int prices[]) {
        // maximum possible Integer number that can be represented in 32 bits
        int minSoFar = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            // If current price is less than our minimum,
            if (prices[i] < minSoFar){
                // update the minimum vale
                minSoFar = prices[i];
            }
            // Else, if the new profit is bigger than current max profit,
            else if (prices[i] - minSoFar > maxprofit){
                // update the current max profit
                maxprofit = prices[i] - minSoFar;
            }
        }
        return maxprofit;
    }


    public static void main (String[] args){
        LC0121 lc0121 = new LC0121();
        int[] l1 = {7, 1, 5, 3, 6, 4};
        int maxProfit = lc0121.maxProfit(l1);

        // print values
        System.out.println(maxProfit);
    }

}
