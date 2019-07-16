package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public List<Integer> partitionLabels(String S) {
        if(S.length()==0||S==null)return null;
         List<Integer>res =new ArrayList<>();
         Map<Character,Integer> map=new HashMap<Character,Integer>(26);
         for(int i=0;i<S.length();i++)map.put(S.charAt(i),i); //record last index
        int start=0; int end=0; int last=0;    //record target substring
         for(int j=0;j<S.length();j++){
             last=Math.max(last,map.get(S.charAt(j)));
             if(last==j){
                 res.add(last-start+1);
                 start=last+1;
             }
         }return res;
    }
}
