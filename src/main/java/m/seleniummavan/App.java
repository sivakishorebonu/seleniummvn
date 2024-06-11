package m.seleniummavan;

/**
 * Hello world!
 *
 */
public class App {
	int a;
	int b;
	
	void addExample() {
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		App a1 = new App();
		a1.a =5;
		a1.b = 6;
		a1.addExample();
		
		App a2 = new App();
		a2.a =4;
		a2.b = 10;
		a2.addExample();
	}
}
