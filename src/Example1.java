
public class Example1 {
	public static void main(String[] args) {
		
		// Cach su dung cu
		// Cach 1
		class SayHelloImpl implements SayHello {
			public void say() {
				System.out.println("Hello1.");
			}
		}
		SayHelloImpl sh1 = new SayHelloImpl();
		sh1.say();
		
		// Cach 2
		SayHello sh2 = new SayHello() {
			public void say() {
				System.out.println("Hello2.");
			}
		};
		sh2.say();
		
		// Cach su dung tu Java 8
		SayHello sh = () -> {
			System.out.println("Hello. This is new using.");
		};
		sh.say();
	}
}

interface SayHello {
	void say();
}

