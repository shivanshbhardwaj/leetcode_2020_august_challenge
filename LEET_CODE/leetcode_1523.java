package LEET_CODE;

import java.util.Scanner;

public class leetcode_1523 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = s.nextInt();
		int n2 = s.nextInt();

		String str= s.next();
		str.sub
		System.out.println(work(n1, n2));
	}

	private static void input(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();

		}

	}

	private static int work(int low, int hi) {

		int count = 0;

		for (int i = low; i <= hi; i++) {

			if (i % 2 != 0) {
				count++;
			}

		}
		return count;
	}

}
