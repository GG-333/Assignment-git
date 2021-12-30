package com.greatlearning.iitr.labproject;

import java.util.Scanner;

public class TransactionCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of transactions: ");
		int noOfTransaction = sc.nextInt();

		System.out.println("enter transaction values: ");

		int arr[] = new int[noOfTransaction];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the no of targets achieved ");
		int noOfTargets = sc.nextInt();

		while (noOfTargets-- != 0) {
			System.out.println("enter value of targets -- ");
			long targetValue = sc.nextInt();
			boolean isTargetAchieved = false;

			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				if (sum >= targetValue) {
					System.out.println("target is acheived at " + (i + 1));
					isTargetAchieved = true;
					break;
				}

			}
			if (isTargetAchieved == false) {
				System.out.println("your target is not achieved ");

			}

		}
	}

}
