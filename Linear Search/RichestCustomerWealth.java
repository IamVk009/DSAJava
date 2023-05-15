// Leetcode 1672 : Richest Customer Wealth - https://leetcode.com/problems/richest-customer-wealth/
class RichestCustomerWealth{
    public static void main(String[] args) {
        int accounts[][] = {{2,8,7},{7,1,3,11},{1,9,5,9}};
        System.out.println(getRichestCustomer(accounts));
    }

//  Approach Pro : Using Enhanced For Loop
    static int getRichestCustomer(int accounts[][]){
        int richest = Integer.MIN_VALUE;
        for(int bank [] : accounts){
            int totalBalance = 0;
            for(int money : bank){
                totalBalance += money;
                if(totalBalance > richest)
                    richest = totalBalance;
            }
        }
        return richest;
    }
}