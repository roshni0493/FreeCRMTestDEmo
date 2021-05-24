package simple_ArrayListEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<>();
		
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		System.out.println(hs);
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
		String gg=itr.next();
		
		
		System.out.println(gg);
		
		
	}

}
}