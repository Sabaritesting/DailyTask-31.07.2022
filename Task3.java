package Task4;

import java.util.Scanner;

public class Task3 {
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Input a number: ");
	      int n = scan.nextInt();
		  if (n>0)
		  {	
	       while (n%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            n /= 2; 
	        } 
	  
	        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	        { 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            } 
	        } 
	        if (n > 2) 
	            System.out.print(n); 
	       }			
	
	}

}
