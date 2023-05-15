// Leetcode (Problem 1295) : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Check for the total numbers in an array with even number of digits in them using Linear Search algorithm.
class EvenDigitsInNumber{
    public static void main(String[] args) {
        int nums[] = {12, 345, 0, 29, 6, 7896, -789012, -1234, -12};
        System.out.println("Numbers With Even Digits = " + countNumbersWithEvenDigits(nums));
        System.out.println("Numbers With Even Digits = " + returnNumbersWithEvenDigits(nums));
        System.out.println("Numbers With Even Digits = " + giveNumbersWithEvenDigits(nums));
    }

//  Approach 1 : Using Two Different Functions
    static int countNumbersWithEvenDigits(int nums[]){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                continue;
            if(isEven(nums[i]))
                count++;
        }
        return count;
    }

    static boolean isEven(int i){
        int count = 0;
        while(i > 0){
            i /= 10;
            count++;
        }
        if(count % 2 == 0)
            return true;
        return false;
    }

//  Approach 2 : Using Single Function with enhanced For Loop.
    static int returnNumbersWithEvenDigits(int nums[]){
        int count = 0;
        for(int i : nums){
            if(i == 0)
                continue;
            int counter = 0;
            while(i > 0){
                i /= 10;
                counter++;
            }
            if(counter % 2 == 0)
                count++;
        }
        return count;
    }

//  Approach 3 : Pro Approach
    static int giveNumbersWithEvenDigits(int nums[]){
        int count = 0;

        for (int i : nums){
            if(i < 0)
                i *= -1;
            if(i == 0)
                continue;
//          '(int)(Math.log10(number) + 1)' gives total digits in a positive number.
            if(((int)Math.log10(i) + 1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}