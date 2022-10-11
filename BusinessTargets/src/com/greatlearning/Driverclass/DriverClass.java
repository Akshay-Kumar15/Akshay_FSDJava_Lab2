package com.greatlearning.Driverclass;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the values of array ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter number of targets that needs to be achieved");

		int target = sc.nextInt();
		int targetAmount;
		int sum, j, flag = 0;

		for (int i = 0; i < target; i++) {
			sum = 0;

			System.out.println("Enter the value of target");

			targetAmount = sc.nextInt();

			for (j = 0; j < arr.length; j++) {
				sum = sum + arr[j];

				if (sum >= targetAmount)

				{
					System.out.println("Target achieved on " + (j + 1) + " transactions" + "\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)

			{
				System.out.println("Given target is not achieved");
			}

		}

		sc.close();
	}

}
