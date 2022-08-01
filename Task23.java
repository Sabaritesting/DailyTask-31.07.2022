package Task4;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t_set = new TreeSet<String>();
		   // use add() method to add values in the tree set
		          t_set.add("Red");
		          t_set.add("Green");
		          t_set.add("Black");
		          t_set.add("Pink");
		          t_set.add("orange");
		     // print original list
		   System.out.println("Original tree set:" + t_set);  
		     java.util.Iterator<String> it = t_set.descendingIterator();
		     // Print list elements in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
	}

}
