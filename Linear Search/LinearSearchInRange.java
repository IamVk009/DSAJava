// Search for Element within particular range in an Array Using Linear Search Algorithm
class LinearSearchInRange {
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67,78,89,90,100};
        int target = 56;
        int start = 0;
        int end = 9;
        System.out.println(searchInRange2(arr, target, start, end));
    }

//  Approach 1 : Using For Loop
    static String searchInRange1(int arr[], int target, int start, int end){
//      Edge Case Condition
        if(arr.length == 0)
            return "Invalid Array";

        for (int i = start; i <= end; i++){
            if(target == arr[i])
                return "Element found at Index = " + i;
        }
        return "Element Not Found Within Given Range";
    }

//  Approach 2 : Using For-Each Loop
    static String searchInRange2(int arr[], int target, int start, int end){
//      Edge Case Condition
        if(arr.length == 0)
            return "Invalid Array";

        int index = 0;
        for(int i : arr){
            if(index >= start && index <= end && target == i){
                return "Element Found At Index = " + index;
            }
            index++;
        }
        return "Element Not Found";
    }
}