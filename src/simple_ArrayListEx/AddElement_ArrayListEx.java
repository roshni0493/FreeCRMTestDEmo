package simple_ArrayListEx;

import java.util.ArrayList;
import java.util.List;



public class AddElement_ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Before actual array list:"+al);
		
		List<String> list=new ArrayList<String>();
		list.add("One");
		list.add("two");
		
		al.addAll(list);
		System.out.println("\n After Copy ArrayList:"+al);
	}
		
	}


