package m.seleniummavan;

import java.awt.Dialog;

public class Kishore implements Oparations {
	protected int ab;
	int y;

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setA(1);
		p1.getA();
		Kishore d1 = new Kishore();
		d1.dividing(30, 6);
		d1.multipication(5, 2);

	}

	public void dividing(int a, int b) {
		System.out.println(a / b);

	}

	public void multipication(int x, int y) {
		System.out.println(x * y);

	}

}
