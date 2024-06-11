package m.seleniummavan;

public class ArrayExmpl {

	public static void main(String[] args) {
		int a[] = {1,3,4,5,6,7,8,9};
		for(int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
		String name[]= {"Nehara","Kishore","Madhav"};
		System.out.println(name);
		for(int y =0; y < name.length; y++) {
			if(name[y].equals("Kishore")) {
				name[y] = "Bonu "+name[y];
			}
			System.out.println(name[y]);
		}
		char g[]= {'B','V','D'};
		for(int x=0;x < g.length;x++) {
			System.out.print(g[x]+" ");
		}
		
		Person p1 = new Person(); 
		Person p2 = new Person();
		Person p3 = new Person();
		Person persons[] = {p1,p2,p3};
		for(int x = 0; x < persons.length; x++) {
			persons[x].setA(1);
			
			System.out.println(persons[x].getA());
		}
	}

}
