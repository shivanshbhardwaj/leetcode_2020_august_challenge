package LEET_CODE;

import java.util.Scanner;

public class prep {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 2;
		int nsp = n + 1;
		int row = 1;
		while (row <= n) {

			// star

			int cst = 1;
			while (cst <= 2 * n - 1) {
				if (cst <= row)
					System.out.print(cst);
				else if (cst > (2 * n - 1) - row)
					System.out.print(2 * n - cst);
				else
					System.out.print(" ");

				cst++;
				System.out.print("\t");

			}

			// star

			row++;
			nsp -= 2;
			nst += 2;

			System.out.println();

		}

	}
}
