package Iterator_ArraylistEx;

import java.util.HashMap;

public class Copy_HashMapContent {
	
	public static void main(String[] args) {
		HashMap<String, String>hm=new HashMap<>();
		hm.put("first", "Java");
		hm.put("second", "By");
		hm.put("third", "Kiran");
		System.out.println(hm);
		
		HashMap<String, String>hm1=new HashMap<String,String>();
		hm1.put("c1", "JAVA");
		hm1.put("c2", "SELENIUM");
		hm.putAll(hm1);
		System.out.println(hm);
		
	}

}
