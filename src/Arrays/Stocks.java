package Arrays;

public class Stocks {
    
    static int maxProfit(int[] prices){
        int n = prices.length;
        int res = 0;

        for(int i=0; i < n - 1; i++){

            for(int j = i+1; j < n; j++){
                res = Math.max(res, prices[j] - prices[i]);
            }

        }

        return res;
    }

    static void maxProfitNew(int[] prices){
        int res = 0;
        int minSoFar = prices[0];

        for(int i = 0; i < prices.length; i++){
            minSoFar = Math.min(minSoFar,prices[i]);

            res = Math.max(res, prices[i] - minSoFar);
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};

        System.out.println(maxProfit(prices));

        maxProfitNew(prices);
    }

}
