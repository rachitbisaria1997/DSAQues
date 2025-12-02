package Strings;

//Ex – ABC: ABC, BCA, CAB, CBA, BAC, ACB

public class FindPermutations {

    public static void main(String[] args){

        String s = "ABC";
        char[] ch = s.toCharArray();
        permute(ch, 0);
    }

    static void permute(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permute(arr, index + 1);
            swap(arr, i, index); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
