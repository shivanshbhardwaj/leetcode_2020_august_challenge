package LEET_CODE;
import java.util.Scanner;

public class ssstttt {
	
	
	public static void main(String[] args) {


		 Scanner Sc= new Scanner(System.in);

        System.out.println("Enter no of calls made ");

        double noc = Sc.nextDouble();   
        
        double minimum_amount= 300;
        
        double total =300.0;
        
        double ans = func(total,minimum_amount,noc);
        
        System.out.println(ans);
   }

private static double func(double total, double minimum_amount, double noc) {
	

	 if(noc<=120)
        {
        	return total;
        }
	 
	if(noc>120 && noc<=190)
	{
		return total  = total + (noc-120)*1;
	}
	
	if(noc>190 && noc<=240)
	{
		return total  = total + 70+ (noc-190)*0.8;
	}
	
	if(noc>190 && noc<=220)
	{
		return total  = total + 70+ 50*0.8 ;
	}
	
	if(noc>220)
	{
		return total=total +70+50*0.8+ (noc-220)*0.4;
	}
	
	return total;
	
	
}

}
