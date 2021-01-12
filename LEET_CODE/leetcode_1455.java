package LEET_CODE;

import java.util.Scanner;

public class leetcode_1455 {
	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	
	String sentence = s.next();
	String searchWord = s.next();
	
	System.out.println(isPrefixOfWord(sentence, searchWord));
	
	}

	private static int isPrefixOfWord(String sentence, String searchWord) {

		if(sentence.indexOf(searchWord)==-1) {
			return -1;
		}
		
		  
        int  index= sentence.indexOf(searchWord);
       
       int count =0;
       int i=0;
       
       while(i<index)
       {
           if(sentence.charAt(i)==' ') {
        	   
        	   count++;
        	     
           }
           i++; 
       }
       return count;
           
	}

}
