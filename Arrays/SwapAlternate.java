public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr1 = {12, 23, 34, 45, 56, 67, 78, 89};
        int[] arr2 = {12, 23, 34, 45, 56, 67, 78, 89};
        int[] arr3 = {12, 23, 34, 45, 56, 67, 78};
        int[] arr4 = {12, 23, 34, 45, 56, 67, 78};

        printArray(swapAlternate(arr1));
        printArray(swapAlternate2(arr2));
    }

    //  Using while-loop
    private static int[] swapAlternate(int[] a) {
        int start = 0;
        while (start < a.length - 1) {
            int end = start + 1;
            a[start] = a[start] + a[end];
            a[end] = a[start] - a[end];
            a[start] = a[start] - a[end];
            start += 2;
        }
        return a;
    }

    //  Using for-loop
    private static int[] swapAlternate2(int[] a) {
        for (int i = 0; i < a.length - 1; i += 2) {
            if (i + 1 < a.length) {
                a[i] = a[i] + a[i + 1];
                a[i + 1] = a[i] - a[i + 1];
                a[i] = a[i] - a[i + 1];
            }
        }
        return a;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
