package LEET_CODE;

import java.util.Scanner;

public class leetcode_38_count_and_say {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(work(n));

	}

	private static StringBuilder work(int n) {

		if (n == 1) {
			StringBuilder sb = new StringBuilder();
			sb.append("1");
			return sb;
		}

		StringBuilder r = work(n - 1);
		StringBuilder sb = new StringBuilder();

		int count = 1;
		for (int i = 0; i < r.length(); i++) {
			
			
       if(r.length()>1)
			while (i!=r.charAt(r.length()-1) || r.charAt(i) == r.charAt(i + 1) ) {
				count++;
				continue;
			}


			sb.append(count +""+ r.charAt(i));
			System.out.println(sb);

			count = 0;

		}

		return sb;

	}
}
