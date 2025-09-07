package Strings;

public class FindInc {

    public static void main(String[] args) {

        String s = "   1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersIncreasing(s));
    }

    public static boolean areNumbersIncreasing(String s){

        String[] parts = s.split("\\s+");  // split by spaces
        int prev = -1;

        for(String part : parts){

            if(part.matches("\\d+")){
                int num = Integer.parseInt(part);
                if(num <= prev){
                    return false;
                }
                prev = num;
            }
        }
        return true;
    }

}
