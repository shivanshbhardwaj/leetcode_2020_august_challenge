package LEET_CODE;

import java.util.Scanner;

public class rough_work {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int a = work(n);
System.out.println(a);
StringBuilder sb = new StringBuilder();
sb.reverse();
	}

	private static int work(int n) {
		int r = 0;
		while (n != 0) {
			r = r * 10 + n % 10;
			n = n / 10;

		}

		return r;
	}

}
