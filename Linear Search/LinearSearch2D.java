import java.util.Arrays;

// Search for an Element in 2D Array using LinearSearch Algorithm.
class LinearSearch2D{
    public static void main(String[] args) {
        int arr[][] = {{11,22,33,990},{9,87,44,55,66},{12,23,34,76}};
        int target = 8790;
        System.out.println(searchLinear1(arr, target));
        if (Arrays.toString(searchLinear2(arr,target)).equals("null"))
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found At Index = " + Arrays.toString(searchLinear2(arr,target)));
    }

//  Approach 1 : Using For Loop (Beginer Approach).
    static String searchLinear1(int arr[][], int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target)
                    return "Element Found at Index = " + row + " " + col;
            }
        }
        return "Element Not Found";
    }

//  Approach 2 : Using For Loop, returning Result Array (Pro Approach)
    static int [] searchLinear2(int arr[][], int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col])
                    return new int[]{row,col};
            }
        }
//      return new int[]{-1,-1};
        return null;
    }
}