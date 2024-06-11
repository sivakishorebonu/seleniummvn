package m.seleniummavan;

public class MethodLoading extends Kishore {
	public void add() {
		System.out.println("Zero Parameter method");
	}
	public void dividing(int a,int b) {
		System.out.println(a*b);
		
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(int a, int b) {
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		MethodLoading loading = new MethodLoading();
		loading.add();
		loading.add(1,2,3);
		loading.add(6,5);
		loading.dividing(5,6);
	}

}
