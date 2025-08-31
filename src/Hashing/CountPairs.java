package Hashing;

public class CountPairs {

    static final int M = 999983;
    static final int MX = 1000000000;

    static int[] Hash = new int[M];

    // Hash Function
    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {

        int [] arr = {4,4,2,2};
        int n = arr.length;
        int ans = 0;

        for(int i=0; i < n; i++){

            if((long) arr[i] * arr[i] < MX){
                ans += Hash[f(arr[i] * arr[i])];
                System.out.println(ans);
            }
            Hash[f(arr[i])]++;
        }
        System.out.println(ans);
    }
}
