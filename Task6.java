package Task4;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in ); 
        System.out.print("Input the starting number of the range: "); 
        int rsnum = sc.nextInt(); 
        System.out.print("Input the ending number of the range: "); 
        int renum = sc.nextInt(); 
	    int random_num = rsnum + (int)(Math.random() * ((renum - rsnum) + 1));
	    System.out.println(random_num);
	}

}
