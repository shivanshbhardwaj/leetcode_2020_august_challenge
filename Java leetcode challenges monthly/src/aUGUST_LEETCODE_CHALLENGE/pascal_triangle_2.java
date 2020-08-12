package aUGUST_LEETCODE_CHALLENGE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_triangle_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(getRow(n));

	}

	public static List<Integer> getRow(int rowIndex) {

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i <= rowIndex; i++) {

			double  p = factorial(rowIndex) /( factorial(rowIndex - i) * factorial(i));
			
			System.out.println(p);
		p=Math.round(p);
		System.out.println(p);
	

			l.add((int) p);

		}

		return l;

	}

	private static double factorial(int r) {

		if (r == 1 || r == 0) {
			return 1;
		}

		double i = factorial(r - 1);
		
	
		return i * r;
	}

}
