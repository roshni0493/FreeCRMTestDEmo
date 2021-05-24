package Iterator_ArraylistEx;

import java.util.ArrayList;

public class Arraylist_OperationEx {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		//add elements to array list
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		
		//get elements by index
		System.out.println("Element at Index 1:"+al.get(1));
		System.out.println("Does list Contain JAVA:"+al.contains("JAVA"));
		
		//add element at specific index
		al.add(2, "PlAY");
		System.out.println(al);
		
		System.out.println("Is Array List Empty:"+al.isEmpty());
		System.out.println("Index of PERL is:"+al.indexOf("PERL"));
		System.out.println("Array list size:"+al.size());
		
	}

}
