package LEET_CODE;

import java.util.HashMap;
import java.util.Scanner;

public class heysack {
	
	
	public static void main(String[] args) {
		
	HashMap<Integer , Integer > h = new HashMap<Integer, Integer>();
  

	
	Scanner s= new  Scanner(System.in);
  
	StringBuilder sb= new StringBuilder();
	
	
  
  String str1 =s.next();
  String str2 =s.next();


        StringBuilder sb2= new StringBuilder();
   int n= Integer.parseInt(  sb.toString()); 
   
   
   
   int b= Integer.parseInt(  sb2.toString());       
  
  
 System.out.println(work(str1,str2));
                   
 
}

	private static int work(String str1, String str2) {

		if(str1.length()==0)
			return 0;
		
		
		
         return  str1.indexOf(str2);
         
         
		
	}
}