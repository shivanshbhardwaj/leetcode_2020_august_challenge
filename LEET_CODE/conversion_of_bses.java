package LEET_CODE;

import java.util.Scanner;

public class conversion_of_bses {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	
	
	
	
	int n = s.nextInt();   int b1 = s.nextInt();
	int n1 = s.nextInt();   int b2 = s.nextInt();
	int b3 = s.nextInt();
	long ans = 0;
	long ans1 = 0;
	long ans2=0;
	long mul=1;
	long mul2=1;
	long mul3=1;
	while (n > 0) {

		 long rem1 = n % 10;
			n = n / 10;
			ans = ans + rem1 * mul;
			mul=mul*b1;
			
	}
	while (n1 > 0) {

		 long rem1 = n1 % 10;
			n1 = n1 / 10;
			ans1 = ans1 + rem1 * mul2;
			mul2=mul2*b2;
	}
 long 	a=ans+ans1;
	
		while(a>0)
		{
	 long rem2  = a % b3;
		a = a / b3;
		ans2 = ans2 + rem2 * mul3;
		mul3=mul3*10;
		}

	System.out.println(ans2);


}

}
