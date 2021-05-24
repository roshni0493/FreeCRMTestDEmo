package Iterator_ArraylistEx;

import java.util.HashSet;

public class Comparetwo_SetEx {
	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<>();
		
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		hs.add("Karvenagar");
		hs.add("pune");
		System.out.println("First Hashset:="+hs);
		
	HashSet<String> subSet=new HashSet<String>();
	subSet.add("Java");
	subSet.add("J2EE");
	subSet.add("Selenium");
	System.out.println("Second Hashset:="+subSet);
	
	hs.retainAll(subSet);//this function retain common element from both hashset
	System.out.println(""+"Common Hashset content from both:");
	System.out.println(hs);
				
	}

}
