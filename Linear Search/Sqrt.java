class Sqrt{
    public static void main(String[] args) {
        int x = 48;
        System.out.println("Sqrt = " + getSqrt(x));
    }

    static int getSqrt(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0 && i*i == n)
                return i;
        }
        return Integer.MAX_VALUE;
    }
}