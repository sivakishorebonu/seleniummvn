package m.seleniummaven2;

public class Interfaex implements Interfaceex {
	
	public static void main(String[] args) {
//		int a=5;
//		int b=50;
//		int x =1500;
//		int y =500;
		Interfaceex fx =  new Interfaex();
		fx.add(5, 50);
		fx.sub(1000,500);

				
	}

	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	public void sub(int x, int y) {
		System.out.println(x-y);

		
	}
	

}
