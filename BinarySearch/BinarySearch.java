class BinarySearch{
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99,100};
        int target = 99;
        System.out.println(searchBinary(arr, target));
    }
    static String searchBinary(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = end + (start - end) / 2;

            if(target == arr[mid])
                return "Element Found At Index = " + mid;
            else if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
        }

        return "Element Not Found";
    }
}