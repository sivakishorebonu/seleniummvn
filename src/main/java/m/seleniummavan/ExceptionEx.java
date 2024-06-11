package m.seleniummavan;

public class ExceptionEx {
	public static void main(String[] args) {
		int a[] = { 1, 4, 6, 9 };
		try {
			a[9] = 90;
		} catch(Exception e) {
			System.out.println("Exception occured, a[9] not possible");
			System.out.println(e);
		} 
		
		System.out.println(a[0]);
	}
}
