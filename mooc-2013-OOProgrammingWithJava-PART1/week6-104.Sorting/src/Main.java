
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;

    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here

        int index = 0;

        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here

        int smallestIndex = index;

        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp1 = array[index1];
        int temp2 = array[index2];

        array[index1] = temp2;
        array[index2] = temp1;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }

    }

}
