package SortingAlgo;

public class MergeSortArr {

    static void mergeArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge elements in sorted order
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 (fixed)
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        // Print merged array
        for (int h : merged) {
            System.out.print(h + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        mergeArrays(arr1, arr2);
    }
}
