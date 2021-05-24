package simple_ArrayListEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemobeEX {
	public static void main(String[] args) {
		
		
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(4);
		
		HashSet<Integer>al1=new HashSet<>(al);
		System.out.println(al1);
		
		Iterator<Integer>itr=al1.iterator();
		while(itr.hasNext()){
			
			int al2=itr.next();
			System.out.println(al2);
		}
		
	}

}
