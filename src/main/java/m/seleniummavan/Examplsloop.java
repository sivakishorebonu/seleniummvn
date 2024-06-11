package m.seleniummavan;

public class Examplsloop {
	public static void main(String[] args) {
		int count = 1;
		while (count <= 5) {
			System.out.println(count);
			count++;
		}
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		
		int no = 1;
		do {
			System.out.println(no);
			no++;
		} 
		while (no <=5);
			System.out.println("which is not true in condition "+no);
		
	}
}
