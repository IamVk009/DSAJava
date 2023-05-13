class LinearSearch{
    public static void main(String[] args) {
        int [] arr = {23,112,4423,54,221,456,2321,89};
        int target = 54;
        System.out.println(searchLinear1(arr, target));
    }

//    Approach 1 : Using For Loop
    static String searchLinear1(int [] arr, int target){

//      Edge Case Condition
        if(arr.length == 0)
            return "Invalid Array";

        for (int i = 0; i <= arr.length; i++){
            if(target == arr[i])
                return "Element found at index = " + i;
        }
        return "Element Not Found";
    }

//    Approach 2 : Using For-Each Loop
    static String searchLinear2(int arr[], int target){

//      Edge Case Condition
        if(arr.length == 0)
            return "Invalid Array";

        int index = 0;
        for(int i : arr){
            if(target == i)
                return "Element Found At Index " + index;
            index++;
        }
        return "Element Not Found";
    }

//    Approach 3 : Return true or false
    static boolean searchLinear3(int arr[], int target){
        for (int i : arr){
            if(i == target)
                return true;
        }
        return false;
    }
}