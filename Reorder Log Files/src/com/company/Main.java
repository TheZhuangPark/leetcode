package com.company;

import java.util.Comparator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String []logs={"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        String []res=reorderLogFiles(logs);
        for(String s:res){
            System.out.println(s);
        }


    }

    public static String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComp = new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                int s1si = s1.indexOf(' ');
                int s2si = s2.indexOf(' ');
                char s1fc = s1.charAt(s1si+1);
                char s2fc = s2.charAt(s2si+1);
//                char s1fc = s1.charAt(s1.length()-1);
//                char s2fc = s2.charAt(s2.length()-1);

                if(s1fc<='9'){
                    if(s2fc<='9') return 0;
                    else return 1;
                }
                if(s2fc<='9')return -1;

                int preCompute = s1.substring(s1si+1).compareTo(s2.substring(s2si+1));
                if(preCompute==0) return s1.substring(0,s1si).compareTo(s2.substring(0,s2si));
                return preCompute;
            }

        };
        Arrays.sort(logs,myComp);
        return logs;
    }
}
