package Arrays;

import java.util.HashMap;

class FindMissingRepeating {

    static int findMissingElement(int[] arr) {

        int n = arr.length + 1;

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return total - sum;

    }

    static int findRepeating(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int val : map.keySet()) {
            if (map.get(val) > 1) {
                return val;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};

        int missing = findMissingElement(arr);
        int repeat = findRepeating(arr);

        System.out.println("missing number is " + missing);
        System.out.println("repeating number is " + repeat);
    }
}
