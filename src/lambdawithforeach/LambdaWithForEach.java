package lambdawithforeach;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("C");
		list.add("python");
		
		list.forEach((element) -> {
			System.out.println(element);
		});
	}
}
