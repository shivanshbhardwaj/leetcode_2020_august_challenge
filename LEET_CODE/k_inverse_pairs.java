package LEET_CODE;

import java.util.Scanner;

public class k_inverse_pairs {public static void main(String[] args) {
	

Scanner s= new Scanner(System.in);
int n= s.nextInt();
int k= s.nextInt();
find(n,k);
}

private static void find(int n, int k) {
int [] arr = new int [n];
int p=1;
int q=n;
int count =0;
while(p<q&&n>0&&k>=0)
{
	if(arr[p]>arr[q]&&p<q)
	
	p++;
	q--;
}

}
}