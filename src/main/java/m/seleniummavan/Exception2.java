package m.seleniummavan;

public class Exception2 {

	public static void main(String[] args) {
		String b[] = { "Ganesh","siva","Durga"};
		try {
		    b[4]="teddy";
		}catch(Exception e) {
			System.out.println("Exception occured, b[4] not possible");
			System.out.println(e);
		}
			System.out.println(b[0] );
	}

}
