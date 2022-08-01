package Task4;

public class Task27 {
	
		public String repeatAllTwice(String stng) 
		{
		  int l = stng.length();
		  String newstring = "";
		  for (int i = 0; i < l; i++) 
		  {
		    newstring += stng.substring(i,i+1) + stng.substring(i, i+1);
		  }
		  return newstring;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m= new Math();
	      String str1 =  "welcome";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The new string is: "+m.repeatAllTwice(str1));
	}

}
