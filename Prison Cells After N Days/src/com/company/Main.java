package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> seen = new HashMap<>();
        while (N > 0) {
            int[] cells2 = new int[8];
            seen.put(Arrays.toString(cells), N--);
            for (int i = 1; i < 7; ++i)
                cells2[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            cells = cells2;
            if (seen.containsKey(Arrays.toString(cells))) {
                N %= seen.get(Arrays.toString(cells)) - N;
            }
        }//lastseen-curStatc=cycle cur=cur%cycle
        return cells;
    }
}
