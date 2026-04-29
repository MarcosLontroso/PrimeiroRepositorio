package Array;

import java.util.ArrayList;
import java.util.List;

public class questão4 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		
		numbers.remove(2);
		
		System.out.println(numbers);

	}

}
