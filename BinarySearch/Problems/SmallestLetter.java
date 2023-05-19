// Leetcode 744 : Find Smallest Letter Greater Than Target - https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class SmallestLetter{
    public static void main(String[] args) {
        char letters[] = {'c', 'f', 'j', 'm', 'p', 'w', 'z'};
        char target = 'g';
        System.out.println("Smallest Letter Greater Than Target = " + getNextGreatestLetter(letters, target));
    }

    static char getNextGreatestLetter(char letters[], char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
//      Since we have to return first letter if target element is greater than all the other element present in Array
//      We can acheive that using modulo (%) operator.
        return letters[start % letters.length];
    }
}