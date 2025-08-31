package SlidingWindow;

import java.util.Arrays;

public class MaxToys {

    static int maxToys(int cost[], int n, int k){
        int count = 0, sum = 0;
        Arrays.sort(cost);

        for(int i=0; i < n; i++){

            if(sum + cost[i] <= k){
                sum = sum + cost[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int K = 50;
        int cost[] = {1, 12, 5, 111, 200,
                1000, 10, 9, 12, 15};
        int n = cost.length;

        System.out.println(maxToys(cost, n, K));

    }

}
