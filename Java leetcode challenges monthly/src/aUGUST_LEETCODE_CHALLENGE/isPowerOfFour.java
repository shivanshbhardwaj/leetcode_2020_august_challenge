package aUGUST_LEETCODE_CHALLENGE;

import java.util.Scanner;

public class isPowerOfFour {
	

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(isPowerOfFouR(n));
	}

	private static boolean isPowerOfFouR(int num) {
		
		if(num==1)
		{
			return true;
		}
 
	int count =0;
	
	if((num & (num-1))!=0)
	{
		return false;
	}
	
	
	while(num>1)
	{
		num=num>>1;
		count++;
	}
	if(count%2==0)
	{
		return true;
	}
		
	return false;
	}
}
