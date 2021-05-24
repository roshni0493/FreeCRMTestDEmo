package Iterator_ArraylistEx;

//import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Vector;

public class Iterator_VectorEx {
	public static void main(String[] args) {
		
		Vector<Integer>v=new Vector<>();
		v.add(67);
		v.add(12);
		v.add(23);
		v.add(78);
		System.out.println(v);
		
		/*Iterator<Integer>itr=v.iterator();
		for(int dd:v) {
			System.out.println(dd);
		}*/
		
		/*ListIterator<Integer>ltr=v.listIterator();
		while(ltr.hasNext()) {
			int rr=ltr.next();
			System.out.println(rr);
	}*/
		/*for( int i=0;i<v.size();i++) {
			int yy=v.get(i);
			System.out.println(yy);
		}*/
		
	}

}
