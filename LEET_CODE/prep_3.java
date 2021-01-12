package LEET_CODE;

import java.util.Scanner;

public class prep_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int lcm = 0;
		int gcd = 0;
//  GCD
int p1=n1;
int p2=n2;
		while (p1 % p2 != 0)

		{
			int rem = p1 % p2;
			p1 = p2;
			p2 = rem;

		}

// LCM

		lcm = (n1 > n2) ? n1 : n2;
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0)
				break;
			else
				++lcm;
		}
		System.out.print(p2+" ");
		System.out.println(lcm);
	}
}
