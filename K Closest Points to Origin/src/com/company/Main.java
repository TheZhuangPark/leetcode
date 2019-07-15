package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] md = {{3,3},{5,-1},{-2,4}};
        int [][] res=kClosest(md,2);
        printp(res,2);
    }

    public static int[][] kClosest(int[][] points, int K) {
       PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1,p2)->p2[0]*p2[0]+p2[1]*p2[1]-p1[0]*p1[0]-p1[1]*p1[1]);
       for(int[] p: points) {
           pq.offer(p);
           if(pq.size() > K) {
             pq.poll();
           }
       }
        System.out.println("finish pq");
       int [][]res=new int[K][2];
       while(K>0){
           res[--K]=pq.poll();
       }
       return res;
    }

    public static void printp(int[][] points,int K){
        for(int[] p: points){
            System.out.print("("+p[0]+","+p[1]+") ");
        }
    }



}
