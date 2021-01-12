package LEET_CODE;

import java.util.Scanner;

public class leetcode_50_pow {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		double x= s.nextDouble();
		int n = s.nextInt();
		System.out.println(myPow(x, n)) ;
		
	}
	    public static double myPow(double x, int n) {
	    	
	    	if(x==-1&& n==Integer.MIN_VALUE)
	    	{
	    		return 1;
	    	}
	    	
	    	if(x==1||x==0 ||x==-1)
	    	{ 
	    		return x;
	    	}
	    	
	    	
	    	if(n<=-2147483648 ||n> 2147483647)
	    	{System.out.println("-----------");
	    		return 0;
	    	} 
	        
	        double p = x ;
	        double ans=1;
	        int  q = Math.abs(n) ;
	       
	        
	        System.out.println("q   "+q);
	        
	        while(q>0)
	        {
	            ans=ans*p;
	            
	             
	            q--;
	            
	        }
	        double a= 1/ans;
	        System.out.println(a);
	        System.out.println(ans);
	        if(n>0)
	            return ans;
	        else
	            return a;
	        
	    }

}
