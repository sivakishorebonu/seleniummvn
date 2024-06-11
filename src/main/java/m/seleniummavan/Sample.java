package m.seleniummavan;

public class Sample {
	static int a;
	static int d;
	int x;
	int y;

	static void add() {
		System.out.println(a+d);
	}

	void addNonSatic() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		a=1;
		d=4;
		add();
		Sample s1=new Sample();
		s1.x=3;
		s1.y=7;
		s1.addNonSatic();
	}
	
}
