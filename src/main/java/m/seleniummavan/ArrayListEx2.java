package m.seleniummavan;
import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		
		System.out.println(numbers.get(0));
		System.out.println(numbers.size());
		
		for(Integer el: numbers) {
			System.out.println(el);
		}
		
//		for(int x = 0; x< numbers.size();x++) {
//			System.out.println(numbers.get(x));
//		}
	}
}

