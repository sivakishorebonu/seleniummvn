package m.seleniummavan;

public class ArrayEx2 {
	public static void main(String[] args) {
		int a[] = {8,9,1,9,1,5,8,4,8,1};
		int count =0;
		for(int x=0;x<a.length;x++) {
			if(a[x] == 8) {
				count++;
			}
		}
		System.out.println(count);
	}

}
