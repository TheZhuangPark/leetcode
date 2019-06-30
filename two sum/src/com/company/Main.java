package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] num=new int[]{2,7,11,5};
        int[] re = twoSum(num,9);
        System.out.println(re[0]+" "+re[1]);




    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("t:"+target+"n["+i+"]:"+numbers[i]);
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            System.out.println("put key:"+numbers[i]+"value:"+(i+1));
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
