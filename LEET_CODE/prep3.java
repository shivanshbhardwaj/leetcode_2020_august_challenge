
package LEET_CODE;

import java.util.Scanner;

public class prep3 { 
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int rotation = s.nextInt();
		int[][] ar = new int[n1][n2];
		
		input(ar);
		display(ar,rotation );
	}

	private static void display(int[][] ar, int rotation) {

		int mini_row = 0;
		int max_row = ar.length - 1;
		int mini_col = 0;
		int max_col = ar[0].length - 1;

		int no = (max_row + 1) * (max_col + 1);

		int count = 0;
		while (count <  no) {

			for (int b = mini_col+rotation; b <= max_col; b++) {
				System.out.print(ar[mini_row][b] + ", ");
				count++;
			}
System.out.println();
			if (count >= no)
				break;

			mini_row++;

			for (int a = mini_row; a <= max_row; a++) {
				System.out.print(ar[a][max_col] + ", ");
				count++;
			}
System.out.println();
			if (count >= no)
				break;

			max_col--;

			for (int b = max_col; b >= mini_col; b--) {
				System.out.print(ar[max_row][b] + ", ");
				count++;
			}
System.out.println();
			if (count >= no)
				break;

			max_row--;

			for (int a = max_row; a >= mini_row; a--) {
				System.out.print(ar[a][mini_col] + ", ");
				count++;
			}
			System.out.println();

			if (count >= no)
				break;

			mini_col++;
		}
		System.out.print("END");
	}

	private static void input(int[][] ar) {
		for (int p = 0; p < ar.length; p++) {
			for (int q = 0; q < ar[0].length; q++) {
				ar[p][q] = s.nextInt();
			}

		}

	}
}

