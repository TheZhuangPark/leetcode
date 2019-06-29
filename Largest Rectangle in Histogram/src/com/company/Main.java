package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test=new int[]{2,1,5,6,2,3};
        int re=largestRectangleArea(test);
        System.out.println(re);
    }
    public static int largestRectangleArea(int[] heights){
        int n=heights.length;
        int[] leftarray=new int[n];
        int[] rightarray=new int[n];
        int maxsize=0;

        for(int index=0;index<heights.length;index++){
            int leftp=index;
            int rightp=index+1;
            leftarray[index]=0;
            rightarray[index]=n;

            for(int j=leftp-1;j>=0;j--){
                if(heights[j]<heights[index]){
                    leftarray[index]=j+1;
                    break;
                }
            }

            for(int j=rightp;j<n;j++){
                if(heights[j]<heights[index]){
                    rightarray[index]=j;
                    break;
                }
            }
            int tmp=heights[index]*(rightarray[index]-leftarray[index]);
            if(tmp>maxsize)maxsize=tmp;

        }
        return maxsize;
    }
}
