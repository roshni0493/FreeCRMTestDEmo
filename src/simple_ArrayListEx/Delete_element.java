package simple_ArrayListEx;

import java.util.ArrayList;

public class Delete_element {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
			al.add("Zero");
			al.add("First");
			al.add("Second");
			al.add("Third");
			al.add("Random");
			System.out.println("Actual ArrayList:"+al);
			
			al.clear();//this function delete all items from arraylist
			System.out.println("\n After clear ArrayList:"+al);
		}
		
	}


