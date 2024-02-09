// Find Minimum and Maximum Value In an Array using Linear Search Algorithm
class ArrayMinMax{
    public static void main(String[] args) {
        int arr[] = {-2,23,234,-45,11178,98,21,1998};
        int min = getMin(arr);
        int max = getMax(arr);
        System.out.println("Min = " + min + " Max = " + max);
    }

    static int getMin(int arr[]){

//      Edge Case Condition
        if(arr.length == 0)
            return -1;

        int min = Integer.MAX_VALUE;

//        Approach1 : Using For Loop
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min)
//                min = arr[i];
//        }

//      Approach 2 : Using For-Each Loop
        for(int i : arr){
            if(i < min)
                min = i;
        }
        return min;
    }

    static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;

//      Edge Case Condition
        if(arr.length == 0)
            return -1;

//        Approach1 : Using For Loop
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max)
//                max = arr[i];
//        }

//      Approach 2 : Using For-Each Loop
        for(int i : arr){
            if(i > max)
                max = i;
        }
        return max;
    }
}