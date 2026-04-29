package Array;

import java.util.ArrayList;
import java.util.List;

public class questão6 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
