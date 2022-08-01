package Task4;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		// set Iterator at specified index
		   ListIterator<String> p = l_list.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
	}

}
