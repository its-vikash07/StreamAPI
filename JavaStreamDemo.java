package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{
	int sid;
	String Name;
	String rollNo;
	String address;
	public A(int sid, String name, String rollNo, String address) {
		this.sid = sid;
	    this.Name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
}

public class JavaStreamDemo {

	public static void main(String[] args) {
		List<A>studentList=new ArrayList<A>();
		studentList.add(new A(1,"Vikash","RWI090","Indore"));
		studentList.add(new A(2,"Sneha","RWI088","Indore"));
		studentList.add(new A(3,"Harshit","RWI089","Indore"));
		studentList.add(new A(4,"Sakshi","RWI127","Bhilai"));
		studentList.add(new A(5,"siddharth","RWI151","Durg"));
		
		List<Integer>statelist=studentList.stream()
                           .filter(p->p.sid>3)//Filering
                           .map(m->m.sid).//fetching
                           collect(Collectors.toList());
		System.out.println(statelist);
		
		             
		
		

	}

}

