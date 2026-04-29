package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class questão8 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Marcos");
		names.add("Joana");
		names.add("Alvaro");
		names.add("Vitória");
		
		Collections.sort(names);
		System.out.println(names);
	}

}
