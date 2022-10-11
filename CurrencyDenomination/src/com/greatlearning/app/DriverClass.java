package com.greatlearning.app;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.BubbleSort;
import com.greatlearning.service.CurrencyCount;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of Currency denominations");
		int size = sc.nextInt();

		int currency[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Currency Denominations value " + i);
			currency[i] = sc.nextInt();
		}

		BubbleSort bs = new BubbleSort();
		bs.sort(currency);
		System.out.println("After sorting" + Arrays.toString(currency));

		System.out.println("Please enter How much payment u need to pay");
		int amount = sc.nextInt();

		CurrencyCount nc = new CurrencyCount();
		nc.counting(currency, amount);

	}

}
