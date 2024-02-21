//https://www.codingninjas.com/studio/problems/find-unique_625159

public class UniqueArrayElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 3, 4};
        int[] arr2 = {5, 3, 1, 5, 1, 3, 4, 7, 4, 8, 8};
        System.out.println(getUnique(arr2));
    }

    private static int getUnique(int[] arr){
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }
}
