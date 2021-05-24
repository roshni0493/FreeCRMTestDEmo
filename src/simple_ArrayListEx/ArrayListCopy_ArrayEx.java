package simple_ArrayListEx;

import java.util.ArrayList;

public class ArrayListCopy_ArrayEx {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nagpur");
		al.add("Aurangabad");
		al.add("Delhi");
		System.out.println("Actual ArrayList:"+al);
		
		String[]b=new String[al.size()];
		al.toArray(b);
		System.out.println("\n Created Array content");
		
		for(String str:b) {
			System.out.println(str);
		}
		
	}

}
