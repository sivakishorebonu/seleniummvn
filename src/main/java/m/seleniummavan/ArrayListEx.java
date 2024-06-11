package m.seleniummavan;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<String>();
		
		numbers.add("1");numbers.add("4");numbers.add("7");numbers.add("9");
		System.out.println(numbers);
		
		for(String a: numbers) {
			if(a.equals("7")) {
				numbers.remove(a);
			}
		}
		
//		for(int x =0; x< numbers.size(); x++) {
//			System.out.println(numbers.get(x));
//		}
		
		System.out.println(numbers.size());
		System.out.println(numbers);
	}
}
