package Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int [] nums = {1,3,3,3,4,3};

        int result = removeElement(nums, 3);
        System.out.println(result);

    }

    public static int removeElement(int [] nums, int val){
        int len = 0;
        for(int i : nums){
            if(i != val){
                len += 1;
            }
        }

        return len;
    }
}
