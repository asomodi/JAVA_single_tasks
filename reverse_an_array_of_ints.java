/** Given an array of ints (nums), this code returns a new array (reverseArray) with the elements in reverse order.
 */

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 8, 16, 32, 64};
        System.out.println("The array reversed: ");
        reverseArray(nums);
    }

    private static void reverseArray(int[] nums) {
        int[] reverseArray = new int[7];
        for (int i = 0; i < nums.length; i++) {
            reverseArray[i] = nums[(nums.length - i) - 1];
        }
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + ", ");
        }
    }
}
