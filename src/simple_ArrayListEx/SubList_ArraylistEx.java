package simple_ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class SubList_ArraylistEx {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		al.add("Click");
		System.out.println("Actual array list:"+al);
		
		List<String> list=al.subList(0, 4);
		System.out.println("\nSubList:"+list);
	}

}
