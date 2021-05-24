package Iterator_ArraylistEx;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		
		HashMap<String, String>hm=new HashMap<>();
		
		hm.put("first", "java");
		hm.put("second", "By");
		hm.put("third", "Kiran");
		System.out.println(hm);
		
		Set<String>keys=hm.keySet();
		
		for(String key:keys) {
			System.out.println("Value of"+key+" is:"+hm.get(key));
		}
	}

}
