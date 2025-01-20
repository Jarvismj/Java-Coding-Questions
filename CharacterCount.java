package srctest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitsClass {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("dr apj abdul kalam", "pratibha patil", "pranab mukherjee", "ram nath kovind",
				"droupadi murmu");
		
		System.out.println(al.stream().flatMap(i->i.replaceAll(" ","").chars().mapToObj(c->Character.valueOf((char)c))).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())));

	}

}
