package Task4;


import java.util.LinkedList;

public class Task21 {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("Pink");
		          l_list.add("orange");
		   System.out.println("The Original linked list: " + l_list);
		    Object firstElement = l_list.removeFirst();
		    System.out.println("Element removed: "+ firstElement);
		    Object lastElement = l_list.removeLast();
		    System.out.println("Element removed: "+ lastElement);
		    System.out.println("The New linked list: " + l_list);

		}

}
