package LEET_CODE;

import java.util.ArrayList;
import java.util.Scanner;

public class check_is_it_a_straight_line {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<int[]> ar = new ArrayList<int[]>();
		input(ar);
System.out.println(check(ar));
	}

	private static Boolean check(ArrayList<int[]> ar) {

		int m = (ar.get(1)[1] - ar.get(0)[1]) / (ar.get(1)[0] - ar.get(0)[0]);

		for (int n = 1; n < ar.size(); n++) {

			int c = (ar.get(n)[1] - ar.get(n - 1)[1]) / (ar.get(n)[0] - ar.get(n - 1)[0]);

			if (c != m) {
				return false;
			}

		}

		return true;

	}

	private static void input(ArrayList<int[]> ar) {
		int n = 0;
		
		while (n < 4) {
			int[] arr = new int[2];
			arr[0] = s.nextInt();
			arr[1] = s.nextInt();
			ar.add(arr);
			n++;
		}
	
	}

}
