package com.hackerrank.warmpupchallenge;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	static int sockMerchant(int n, int[] socks) {
		int PAIRS = 0;
		HashMap<Integer, Integer> sockMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < socks.length; i++) {
			if(sockMap.containsKey(socks[i]))
				sockMap.put(socks[i], sockMap.get(socks[i]) +1);
			else 
				sockMap.put(socks[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry:sockMap.entrySet())
			PAIRS+=entry.getValue() / 2;
		
		return PAIRS;
	}

	public static void main(String[] args) {
		int[] socks = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, socks));
	}

}
