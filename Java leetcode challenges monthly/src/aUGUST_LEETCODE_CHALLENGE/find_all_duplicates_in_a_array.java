package aUGUST_LEETCODE_CHALLENGE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class find_all_duplicates_in_a_array {

 static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[] nums = new int[n];
	input(nums);
	
	
	System.out.println(findDuplicates(nums));
	
//	display(nums);

}

private static List<Integer> findDuplicates(int[] nums) {

	List<Integer> l = new ArrayList<Integer>();
	
	HashMap<Integer, Integer> h = new HashMap <Integer, Integer> ();
	
	
	for (int i = 0; i < nums.length; i++) {
		
		if(h.containsKey(nums[i])==false)
		h.put(nums[i], 1);
		else
		{
			
			h.put(nums[i], h.get(nums[i])+1);
			
			if(h.get(nums[i])==2)
			{
				
				l.add(nums[i]);
				
				h.remove(nums[i]);
			}
			
		}
		
		
	}
	
	return l;
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
