package ComparatorDemo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
	
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student (101,"kiran",23));
		al.add(new Student(106,"Tomesh",27));
		al.add(new Student(105,"Yogesh",21));
		
		System.out.println("Sorting by Name..");
		Collections.sort(al,new NameCompare());
		
		Iterator<Student>itr1=al.iterator();
		while(itr1.hasNext()) {
			Student st=(Student)itr1.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
			System.out.println("Sorting by age...");
			Collections.sort(al,new AgeCompare());
			
			Iterator<Student>itr2=al.iterator();
			while(itr2.hasNext()) {
				Student st=(Student)itr2.next();
				System.out.println(st.age+" "+st.name+" "+st.age);
		}
		
		
	}

}
