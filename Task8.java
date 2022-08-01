package Task4;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value");
	        int num = sc.nextInt();
	        int ans = 0;
	    
	        for(int i=0; i<num; i++)
	        {
	            if(i*(i+1) == num)
	            {
	                ans = 1;
	                break;
	            }
	        }
	         
	        if(ans == 1)
	            System.out.println("Pronic Number.");
	        else
	            System.out.println("Not a Pronic Number.");      
	}

}
