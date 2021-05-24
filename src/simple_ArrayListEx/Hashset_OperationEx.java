package simple_ArrayListEx;

import java.util.HashSet;

public class Hashset_OperationEx {
	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<>();
		
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		hs.add("Karvenagar");
		System.out.println(hs);
		
		System.out.println("HashSet is empty or not="+hs.isEmpty());
		
		hs.remove("Karvenagar");
		
		System.out.println(hs);
		
		System.out.println("Size of HashSet="+hs.size());
		
		System.out.println("Does hashSet contains first element="+hs.contains("Java"));
	}

}
