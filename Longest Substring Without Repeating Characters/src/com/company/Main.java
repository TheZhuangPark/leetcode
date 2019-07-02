package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String str="tmmzuxt";
       int result=lengthOfLongestSubstring(str);
       System.out.println("result "+result);
    }
    public static int lengthOfLongestSubstring(String s) {
        int slen=s.length();
        if(slen==0||slen==1)return slen;

        int left=0,right=1,max=1;
        Map<Character,Integer> map= new HashMap<Character,Integer>(slen);
        map.put(s.charAt(0),0);
        for(;right<s.length();right++){
            //System.out.println("IsContain:"+IsContain(map,s.charAt(right)));
            Character cright=s.charAt(right) ;
            if( map.containsKey(cright) ){//Contain
                left=Math.max(map.get(cright)+1,left);
                //System.out.println("left"+left+" right:"+right+"len："+len);
            }
            map.put(cright,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }


//
//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length()==0) return 0;
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int max=0;
//        for (int i=0, j=0; i<s.length(); ++i){
//            System.out.println("IsContain:"+map.containsKey(s.charAt(i)) );
//
//            if (map.containsKey(s.charAt(i))){
//                System.out.println("j from:"+j);
//                j = Math.max(j,map.get(s.charAt(i))+1);
//                System.out.println("to "+j);
//            }
//            map.put(s.charAt(i),i);
//            System.out.println("put "+s.charAt(i)+" to "+i);
//            max = Math.max(max,i-j+1);
//            System.out.println("max"+max);
//        }
//        return max;
//    }
}
