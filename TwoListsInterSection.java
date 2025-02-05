package srctest;

import java.util.Arrays;

public class MainProduct {

	public static void main(String[] args) {

		List<Integer> num1 = Arrays.asList(1, 2, 3);
		List<Integer> num2 = Arrays.asList(3, 2, 4);

		num1.stream().filter(num2::contains).forEach(System.out::println);

	}

}
