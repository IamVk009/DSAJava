class LinearSearch{
    public static void main(String[] args) {
        int [] arr = {23,112,4423,54,221,456,2321,89};
        int target = 89;
        System.out.println(searchLinear(arr, target));
    }

    static String searchLinear(int [] arr, int target){
//        for (int i = 0; i <= arr.length; i++){
//            if(target == arr[i])
//                return "Element found at index = " + i;
//        }

//        Using for-each loop
        int index = 0;
        for(int i : arr){
            if(target == i)
                return "Element Found At Index " + index;
            index++;
        }
        return "Element Not Found";
    }
}