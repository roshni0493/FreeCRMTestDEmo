package Iterator_ArraylistEx;

import java.util.HashMap;

public class HashMapDemo1 {
	
	public static void main(String[] args) {
		
		HashMap<String, String>hm=new HashMap<>();
		hm.put("One", "Java");
		hm.put("Two", "By");
		hm.put("three", "kiran");
		System.out.println(hm);
		System.out.println("Value of Second:="+hm.get("Two"));
		System.out.println("IsHashMap empty or not:="+hm.isEmpty());
		
		hm.remove("three");
		System.out.println(hm);
		System.out.println("Size of HashMap:="+hm.size());
	}

}
