/*Given an array of ints (array), the code returns an array (newArray)
  with the largest element replacing all the other elements.
*/

public class Main {

    public static void main(String[] args) {

        int[] array = {12, 48, 9, 23, 66};
        System.out.println("The new array: ");
        maxEnd(array);
    }

    private static void maxEnd(int[] array) {
        int[] newArray = new int[5];
        int largest = 0;
        if (array[0] > array[array.length - 1]) {
            largest = array[0];
        } else {
            largest = array[array.length - 1];
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = largest;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
