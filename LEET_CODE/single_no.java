package LEET_CODE;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import hash_map.hashmap;

public class single_no {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		input(arr);

		System.out.println(check(arr));
//	display(arr);

	}

	private static Integer check(int[] arr) {
		HashMap<Integer, Integer> h = new HashMap();
		{
			for (int val : arr) {
				{
					if (h.get(val) == null)
						h.put(val, 1);
					else
						h.put(val, 2);
				}
			}
				
			
			for(Integer vall:h.keySet())
				{
			 if (h.get(vall)==1)
				 return vall;
				}
				
			return null;
			
			
			

		}
	

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
