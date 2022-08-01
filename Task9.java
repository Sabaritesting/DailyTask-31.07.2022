package Task4;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value");
        int num = sc.nextInt();
        int sq_num = num*num;  
 
        String str_num = Integer.toString(num);  
        String square = Integer.toString(sq_num);  
 
        if(square.endsWith(str_num))  
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");
	}

}
