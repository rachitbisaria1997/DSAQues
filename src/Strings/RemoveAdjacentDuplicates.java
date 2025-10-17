package Strings;

public class RemoveAdjacentDuplicates {

    public static String removeDuplicate(String inp){
        boolean changed;

        do {
            changed = false;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < inp.length(); i++) {
                // if current char is same as next char, skip both
                if (i < inp.length() - 1 && inp.charAt(i) == inp.charAt(i + 1)) {
                    changed = true;
                    i++; // skip the next duplicate too
                } else {
                    sb.append(inp.charAt(i));
                }
            }

            inp = sb.toString(); // update input for next iteration

        } while (changed); // keep looping until no more removals

        return inp;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("ABBC"));     // AC
        System.out.println(removeDuplicate("ABCCBDA"));  // ADA
        System.out.println(removeDuplicate("AABBCC"));   // (empty)
        System.out.println(removeDuplicate("AABCCBBA")); // A
    }

}
