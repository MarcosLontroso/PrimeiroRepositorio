package Array;

import java.util.ArrayList;
import java.util.List;

public class questão5 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);

		if (numbers.contains(10)) System.out.println("número 15 está na lista");
		else System.out.println("número 10 não está na lista");
	
	}

}
