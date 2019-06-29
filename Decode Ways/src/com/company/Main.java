package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
         String text="0";
         int re=numDecodings(text);
         System.out.println(re);

    }
    public static int numDecodings(String s){
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(1,0);
        Decodings(0,s,map);
        return map.get(1);

    }
    public static int Decodings(int i, String s, HashMap<Integer,Integer> map){
       if(i<s.length()) {
           if (s.charAt(i) == '0') {
               System.out.println("prun ! i:" + i + " char:" + s.charAt(i));
               return 0;
           }
       }

        if(i==s.length()){
            int re=map.get(1);
            re++;
            System.out.println("re:"+re);
            map.put(1,re);
            return 0;
        }
        System.out.println("i:"+i+" char:"+s.charAt(i));
        Decodings(i+1,s,map);

        if((i+1)==s.length()){
            return 0;
        }else
        {
           int char_i=s.charAt(i);
           int char_i2=s.charAt(i+1);
           int tmp=(char_i-48)*10+(char_i2-48);
           if(tmp<=26) {
               System.out.println("i:"+i+" char:"+tmp);
               Decodings(i + 2, s, map);
           }

        }
        return 0;
    }
}
