package simple_ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class listElement_orNot {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		
		List<String> list=new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does ArrayList contains all list Element or not:"+al.containsAll(list));
		
		list.add("Fourth");
		System.out.println("\n Does Array list contains all  list elements?:"+al.containsAll(list));
	}

}
