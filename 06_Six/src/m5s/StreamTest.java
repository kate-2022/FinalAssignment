package m5s;

import java.util.*;
import java.util.stream.*;


public class StreamTest {
	public static void main(String[] args){
		ArrayList<String>names = new ArrayList<String>();
		names.add("Nitin");
		names.add("Hyder");
		names.add("NitinsMum");
		names.add("HydersDaugther");
		names.add("HydersWife");
		names.add("Student1");
		names.add("Student2");
		names.add("Student3");
		names.add("Student4");
		names.add("Student5");
		names.add("Student6");
		names.add("Student7");
		names.add("Student8");
		names.add("Student9");

		System.out.println(names);

		System.out.println();


		//from JDK1.8V using streams
		List<String> streamList = names.stream().map(name-> name.toLowerCase()).collect(Collectors.toList());
		System.out.println(streamList);
		System.out.println();
		
		streamList.stream().sorted().forEach(name->System.out.println(name));



	}
}






