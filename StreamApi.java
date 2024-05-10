package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;


public class StreamApi {

	public static void main(String[] args) {
		
//		List<String>list=new ArrayList<>();
		
		List<String> list1=List.of("Sneha","Ankit","Sakshi","Siddharth"); //
		// this list is Immutable means doesnt change this list and not add the more element
		List<String> names= list1.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(names);
		
		
	}

}
