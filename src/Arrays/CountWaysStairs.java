package Arrays;

public class CountWaysStairs {

    public static void main(String[] args) {

        System.out.println(countWays(4));
    }

    static int countWays(int n){

        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        } // if steps can be 1,2 or 3

        return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }

    static int climbStairs(int n){

        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0; // it step can be either 1 or 2
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


}


//    A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
//        The task is to implement a method to count how many possible ways the child can run up the stairs.