package Array;

import java.util.ArrayList;
import java.util.List;

public class questão10 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		
		int sum=0;
		
		for (Integer num : numbers) sum+=num;
		
		System.out.println("Soma: " + sum);
	}

}
