
public class Example3 {
	public static void main(String[] args) {
		Total total = (a, b) -> {
			return (a + b);
		};
		
		int c = total.add(10, 20);
		System.out.println("c = " + c);
	}
}

interface Total {
	int add(int a, int b);
}