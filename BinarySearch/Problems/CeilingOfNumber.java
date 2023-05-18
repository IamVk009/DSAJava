// Search and find the Ceiling of a target number Present in given sorted array using Binary Search Algorithm.
// Ceiling Of Number = Smallest number in array which is greater than or equal to target element.
class CeilingOfNumber{
    public static void main(String[] args) {
        int nums[] = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println("Ceiling Of Number = " + getCeiling(nums, target));
    }

    static int getCeiling(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;

        if(target > nums[end])
            return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid])
                return target;

            if(target < nums[mid])
                end = mid - 1;

            if(target > nums[mid])
                start = mid + 1;
        }
//      After searching all the elements if condition 'start <= end' fails, then start will be the index of answer.
        return nums[start];
    }
}