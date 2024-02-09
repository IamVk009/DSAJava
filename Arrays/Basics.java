import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//      Declare & Initialize Array
        int[] arr1 = {11, 22, 33};
//      Declare Array with fixed siZe
        int[] arr2 = new int[10];
//      Fill above array with same element at all places
        Arrays.fill(arr2, 2);
        printArray(arr2);
//      Print Sum of all elements of array
        System.out.println("ArraySum = " + getArraySum(arr2));
    }

    private static void printArray(int[] arr){
        for(int i : arr) System.out.print(i + " ");
    }

    private static int getArraySum(int[] arr){
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
}
