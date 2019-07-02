package com.company;

public class Main {

    private static int lo, maxLen;

    public static void main(String[] args) {
	// write your code here
    }
    public static String longestPalindrome(String s){
           int slen=s.length();
           if(slen<2)return s;
          
           for(int i=0;i<slen-1;i++){
               ExtendPalindrome(s,i,i);
               ExtendPalindrome(s,i,i+1);
           }
           return s.substring(lo,lo+maxLen);
    }
    public static void ExtendPalindrome(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        int len=right-left-1;
        if(maxLen<len){
            maxLen=len;
            lo=left+1;
        }
    }
}
