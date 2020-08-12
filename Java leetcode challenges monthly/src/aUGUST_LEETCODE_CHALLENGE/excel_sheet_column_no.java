package aUGUST_LEETCODE_CHALLENGE;

import java.util.HashMap;
import java.util.Scanner;

public class excel_sheet_column_no {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		System.out.println(titleToNumber(str));

	}

	public static int titleToNumber(String s) {

		HashMap<Character, Integer> h = new HashMap<>();

		for (int i = 65; i <= 90; i++) {

			h.put((char) i, i - 64);

		}

		int ans = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			ans = (int) (ans  + ( h.get(s.charAt(i))) * Math.pow(26, ((s.length() -1)- i)));

		}

		return ans;

	}

}
