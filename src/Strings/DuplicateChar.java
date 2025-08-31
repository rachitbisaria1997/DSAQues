package Strings;

class ArmStrongNumber {

    public static void main(String[] args) {

        int number = 153;
        boolean result = isArmStrong(number);
        System.out.print(result);
    }

    public static boolean isArmStrong(int number){
        String str = String.valueOf(number);
        int nlen = str.length();
        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum += Math.pow(digit, nlen);
            number = number / 10;
        }

        System.out.print(((Object)sum).getClass().getName());

        return sum == number;
    }

}
