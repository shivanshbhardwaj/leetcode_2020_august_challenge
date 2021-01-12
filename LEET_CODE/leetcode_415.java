package LEET_CODE;

import java.util.Scanner;

public class leetcode_415 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String num1=s.next();
		String num2=s.next();
		
		System.out.println(addStrings(num1,  num2));
		
		
		
		
		
	}

	private static StringBuilder addStrings(String num1, String num2) {
int i=0;
int j=0;
StringBuilder str= new StringBuilder();
		while(i<num1.length()&&j<num2.length())
		{
			
			int r =(add((int)num1.charAt(i),(int)num2.charAt(j)))%10;
			
			str.append(r);
			
			i++;
			j++;
			
		}
		
		
		return str;
	}
	
	
	public static int add(int  c1,int c2) {
		System.out.println(c1+c2);
		return c1+c2;
	
		
	}
}
