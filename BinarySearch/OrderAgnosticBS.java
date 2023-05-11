class OrderAgnosticBS{
    public static void main(String[] args) {
        int ascArr[] = {12,23,34,45,56,67,78,89,90,100};
        int descArr[] = {98,87,76,65,54,43,32,21,10,1};
        int target = 21;
        System.out.println(searchBinary(descArr, target));
    }

    static String searchBinary(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = end + (start - end) / 2;

            if(target == arr[mid])
                return "Element Found at Index = " + mid;

            if(isAsc){
                if(target < arr[mid])
                    end = mid - 1;
                else if(target > arr[mid])
                    start = mid + 1;
            } else{
                if(target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
            }
        }

        return "Element not found";
    }
}