package Task4;

import java.util.ArrayList;
import java.util.Collections;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap:");
        for(String a: c1){
        System.out.println(a);
      }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
       Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: c1){
        System.out.println(b);
       }
	}

}
