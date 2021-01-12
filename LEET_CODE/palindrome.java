package LEET_CODE;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(isPalindrome(n));
}

	public static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
   
        int i=0;
        int j= str.length()-1;
        
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
            return false;
            }
            
            i++;
            j--;
            
        }
        return true;
}
}
