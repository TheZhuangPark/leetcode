package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []test=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int res=trap(test);
        System.out.println(res);
    }

    public static int trap(int[] A) {
        if (A.length < 3) return 0;

        int ans = 0;
        int l = 0, r = A.length - 1;

        // find the left and right edge which can hold water
        while (l < r && A[l] <= A[l + 1]) l++;
        while (l < r && A[r] <= A[r - 1]) r--;

        while (l < r) {
            int left = A[l];
            int right = A[r];
            if (left <= right) {
                // add volum until an edge larger than the left edge
                while (l < r && left >= A[++l]) {
                    ans += left - A[l];
                   // System.out.println("index:"+l+"left add water"+(left-A[l]));
                }
            } else {
                // add volum until an edge larger than the right volum
                while (l < r && A[--r] <= right) {
                    ans += right - A[r];
                   // System.out.println("index:"+r+"right add water"+(right-A[l]));
                }
            }//System.out.println("finish!");
        }
        return ans;
    }
}
