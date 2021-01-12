package LEET_CODE;

import java.util.ArrayList;
import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		work(n);

	}

	private static ArrayList<int[]> work(int n) {

		ArrayList<int[]> a = new ArrayList<int[]>();

//	 basecase 

		if (n == 1) {
			ArrayList<int[]> bc = new ArrayList<int[]>();
			int[] b = { 1 };
			bc.add(b);
			return bc;
		}

		ArrayList<int[]> r = work(n - 1);

//	 ArrayList<int []> mr= new ArrayList<int[]>();
		int[] arr2 = new int[n + 1];
		
		for (int n1 =1 ; n1 < n; n1++) {
			System.out.println(r.size());
			arr2[0]=r.get((r.size()-1))[0];
			arr2[n]=r.get((r.size()-1))[r.get((r.size()-1)).length-1];

			arr2[n1]=r.get((r.size()-1))[n1]+r.get((r.size()-1))[n-1];
			

		}

	
		return null;

	}
}
