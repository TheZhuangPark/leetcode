package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int []coin={1,2,5};
        int amount=11;
        int result=coinChange(coin,amount);
        System.out.println("result:"+result);
    }
    public static int coinChange(int[] coins, int amount){
        //boudary value
        if(amount<1)return 0;
        return helper(coins,amount,new int[amount]);
    }

    private static int helper(int[] coins, int rem, int[] count){

//        System.out.print("helper: Coins:");
//        for(int coin:coins){//visit every element in coins
//           System.out.print(coin+" ");
//        }
//        System.out.print("Rem:");
//        System.out.print(rem+" ");
//        System.out.print("Counts:");
//        for(int c:count){//visit every element in coins
//            System.out.print(c+" ");
//        }
//        System.out.println(" ");

        if(rem<0){
           // System.out.println("1-Return -1");
            return -1;}//not valid
        if(rem==0){
          //  System.out.println("2-Return 0");
            return 0; //completed
        }
        if(count[rem-1]!=0){
         //   System.out.println("3-Return "+count[rem-1]);
            return count[rem-1];//result array
        }

        int min=Integer.MAX_VALUE;
        for(int coin:coins){//visit every element in coins
            int res=helper(coins,rem-coin,count);
            if(res>=0 && res<min){
                min=1+res;
            }
        }
        count[rem-1]=(min==Integer.MAX_VALUE)?-1:min;
     //   System.out.println("4-Return "+count[rem-1]);
        return count[rem-1];

    }
}
