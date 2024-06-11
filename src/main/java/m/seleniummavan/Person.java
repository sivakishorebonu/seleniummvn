package m.seleniummavan;

public class Person {
	private int a;
	private int b;
	static int c = 9;
	public Person() {
		System.out.println("Call constructor");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.a = 1;
	}
}
