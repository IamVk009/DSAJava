// Search for Character in A String Using Linear Search Algorithm
class LinearSearchInStrings {
    public static void main(String[] args) {
        String str = "I am flash, The fastest man alive";
        char target = 'e';
        System.out.println(searchLinear2(str, target));
    }

//  Approach 1 : Using For Loop
    static String searchLinear1(String str, char target){
        if (str.length() == 0)
            return "String Is Invalid";

        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i))
                return "Character Found At Index = " + i;
        }

        return "Character Not Found";
    }

//  Approach 2 : Using For-Each Loop
    static String searchLinear2(String str, char target){
        int index = 0;
        for (char ch : str.toCharArray()){
            if (ch == target)
                return "Character found at Index = " + index;
            index++;
        }

        return "Character not found";
    }
}