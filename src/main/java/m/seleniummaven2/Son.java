package m.seleniummaven2;

public class Son extends Father {
	public void age(int b) {
		System.out.println("Age in 1nd year "+(a-b));
	}

	public void age() {
//		a=a+1;
//		a++;
//		System.out.println("Age in 2nd year "+(a));
		System.out.println("Age in 2nd year "+(++a));
	}
	public static void main(String[] args) {
		
		Son sun = new Son();
		System.out.println(sun.a);
		sun.age();
		sun.age(1);
	}

}
