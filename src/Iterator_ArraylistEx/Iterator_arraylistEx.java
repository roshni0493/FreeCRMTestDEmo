package Iterator_ArraylistEx;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_arraylistEx {
	
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Aurangabad");
		al.add("Nagpur");
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			String gg=itr.next();
			System.out.println(gg);//syso(itr.next())
		}
	}

}
