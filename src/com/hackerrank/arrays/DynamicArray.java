package com.hackerrank.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @see `https://www.hackerrank.com/challenges/dynamic-array/problem`
 */
public class DynamicArray {


    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<Integer>();
        List<List<Integer>> sequenceList = new ArrayList<List<Integer>>(n);
        int lastAnswer = 0;

        Iterator<List<Integer>> iterator = queries.iterator();

        for (int i = 0; i <n ; i++) {
            sequenceList.add(new ArrayList<Integer>());
        }

        while (iterator.hasNext()) {
            List<Integer> input = iterator.next();
            int type = input.get(0);
            int x = input.get(1);
            int y = input.get(2);
            int sequenceIndex = (x ^ lastAnswer) % n;
            List<Integer> sequence = sequenceList.get(sequenceIndex);
            if (type == 1) {
                sequence.add(y);
                sequenceList.set(sequenceIndex, sequence);
            } else {
                lastAnswer = sequence.get(y % sequence.size());
                result.add(lastAnswer);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>(10);
        n.set(5,1);
    }



}
