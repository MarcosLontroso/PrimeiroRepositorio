package Array;

import java.util.ArrayList;
import java.util.List;

public class questão7 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(); 
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);

		for (Integer num : numbers) {
			System.out.println(num);
		}
	}

}
