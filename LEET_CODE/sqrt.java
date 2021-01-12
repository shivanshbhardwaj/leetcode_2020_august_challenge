package LEET_CODE;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) { 
		
	
	Scanner s=new Scanner(System.in);
	
	Double n= s.nextDouble();
	
	
	System.out.println(work(n));
	}

	private static int  work(Double n) {

		return  (int) Math.sqrt(n);     
		
	}
}
