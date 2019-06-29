package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums=new int[]{1,3,4,-1,2,10,-5,-20,6,9,-12,8,20};
        int re=maxProduct(nums);
        System.out.println("result:"+re);
    }
    public static int maxProduct(int nums[]){
        int n=nums.length;
        if(n==1) {
            return nums[0];
        }//very simple, when n equal 1, there is only one element, return it.

        int gmax=nums[0];
        int max=nums[0];
        int min=nums[0];

        for(int i=1;i<nums.length;i++) {
            int x = nums[i];
            System.out.println(i+"round before"+" max:"+max+" min:"+min+" gmax:"+gmax);
            max = max * x;
            min = min * x;
            if (min > max) {
                int tmp = max;
                max = min;
                min = tmp;

            }
            if (max < x) max = x;
            if (min > x) min = x;
            if (max > gmax) gmax = max;
            System.out.println(i+"round after"+" max:"+max+" min:"+min+" gmax:"+gmax);

        }
        return gmax;
        }


}
