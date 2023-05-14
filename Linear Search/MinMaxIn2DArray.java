// Search for Minimum and Maximum Element In 2D Array using Linear Search Algorithm.
class MinMaxIn2DArray{
    public static void main(String[] args) {
        int arr[][] = {{9,45,0,581},{11,31},{567,345,23,90,44},{-198,654,33,1224,9}};
        System.out.println("Min = " + getMin(arr));
        System.out.println("Max = " + getMax(arr));
        System.out.println("Minimum = " + returnMin(arr));
        System.out.println("Maximum = " + returnMax(arr));
    }

//  Approach 1 : Using For Loop
    static int getMin(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < min)
                    min = arr[row][col];
            }
        }
        return min;
    }

    static int getMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }

//  Approach 2 : Using Enhanced For (For-Each) Loop
    static int returnMin(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int row[] : arr){
            for(int col : row){
                if(col < min)
                    min = col;
            }
        }
        return min;
    }

    static int returnMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row[] : arr){
            for(int col : row){
                if(col > max)
                    max = col;
            }
        }
        return max;
    }
}