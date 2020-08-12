package aUGUST_LEETCODE_CHALLENGE;

import java.util.Arrays;
import java.util.Scanner;

public class H_index {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] a = input(arr);

		System.out.println(hIndex(arr));

		display(a);

	}

	public static int hIndex(int[] citations) {

		int cit = 0;

		Arrays.sort(citations);

		for (int i = citations.length - 1; i >= 0; i--) {

			cit++;

			if (cit > citations[i]) {
				cit--;
				return cit;
			}

			if (cit == citations[i]) {
				return cit;
			}

		}
		return cit;


	}

	public static void display(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
	}

	public static int[] input(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		return arr;
	}

}
