package com.example;

import java.util.ArrayList;

public class Exercise01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 42; // 4-Byte
		Integer y = 42; // 4-Byte + 12-Byte (Header) + 4-Byte (value) = 20-Byte
		                                  // 8-Byte + 16-Byte (Header) + 4-Byte (value) + 4-Byte (padding) = 32-Byte
		y++;
		x++;
		// ArrayList<int> primitives; // 1M * 4B = 4M
		                           // 1M * 20B = 20M
		ArrayList<Integer> numbers = new ArrayList<>(1_000_000); // 1M = 1M * 4B + 1M * 20B = 24 MB
		numbers.add(10,Integer.valueOf(42));
		int[] array = new int[1_000_000]; // 1M => 12-Byte + 4-Byte + 1M * 4B = 4MB
		array[10] = 42;
	}

}
