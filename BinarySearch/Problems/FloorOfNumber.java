// Search and find the Floor of a target element Present in given sorted array using Binary Search Algorithm.
// Floor Of Number = Greatest number in array which is less than or equal to target element.
class FloorOfNumber{
    public static void main(String[] args) {
        int nums[] = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println("Floor of number = " + getFloor(nums, target));
    }

    static int getFloor(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;

        if(target < nums[start])
            return -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid])
                return target;

            if(target < nums[mid])
                end = mid - 1;

            if(target > nums[mid])
                start = mid + 1;
        }
//      After searching all the elements if condition 'start <= end' fails, then end will be the index of required Number.
        return nums[end];
    }
}