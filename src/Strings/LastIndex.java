package Strings;

public class LastIndex {

    public static void main(String[] args) {

        String text = "abracadabra";
        char target = 'a';
        int lastIndex = -1;

        for(int i = text.length() - 1; i >=0; i--){
            if(text.charAt(i) == target){
                lastIndex = i;
                break;
            }
        }

        if(lastIndex != -1){
            System.out.println("last index is "+ lastIndex);
        }
        else{
            System.out.println("last index not found");
        }

    }
}
