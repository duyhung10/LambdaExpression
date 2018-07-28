
public class Example2 {
	public static void main(String[] args) {
		SayHelloWithName sayHello = (name) -> {
			System.out.println("Hello " + name);
		};
		sayHello.sayWithName("Green");

		SayHelloWithName sayHello2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		sayHello2.sayWithName("James");
	}
}

interface SayHelloWithName {
	void sayWithName(String name);
	default void say() {
		
	};
	
}