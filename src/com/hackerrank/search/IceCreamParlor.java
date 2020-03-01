package com.hackerrank.search;

import java.util.HashMap;

/**
 * One Pass Hash Table
 *
 * @see `https://leetcode.com/articles/two-sum/`
 * @see `https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem`
 */

public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] billed = new int[2];
        for (int i = 0; i < cost.length; i++) {
            if (map.containsKey(money - cost[i])) {
                System.out.println(map.get(money - cost[i]) + " " + (i + 1));
                break;
            }
            map.put(cost[i], i + 1);
        }
    }


    public static void main(String[] args) {

        /** TEST CASE 0 **/
        int[] cost = new int[]{1, 4, 5, 3, 2, 8};
        int money = 4;
        whatFlavors(cost, money);
    }
}
