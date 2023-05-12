class LinearSearch2D{
    public static void main(String[] args) {
        int arr[][] = {{11,22,33,990},{9,87,44,55,66},{12,23,34,76}};
        int target = 879;
        System.out.println(searchLinear(arr,target));
    }

    static String searchLinear(int arr[][], int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(target == arr[i][j])
                    return "Element Found At Index = " + i + " " + j;
            }
        }
        return "Element Not Found";
    }
}