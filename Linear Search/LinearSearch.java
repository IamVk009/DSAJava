class LinearSearch{
    public static void main(String[] args) {
        int [] arr = {23,112,4423,54,221,456,2321,89};
        int target = 4423;
        System.out.println(searchLinear(arr, target));
    }

    static String searchLinear(int [] arr, int target){
        for (int i = 0; i <= arr.length; i++){
            if(target == arr[i])
                return "Element found at index = " + i;
        }
        return "Element Not Found";
    }
}