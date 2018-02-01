import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList <String> Names = new ArrayList <String>();
		Names.add("James");
		Names.add("Jack");
		Names.add("Jill");
		Names.add("Phil");
		Names.set(2, "Paco");
		Names.remove(1);
		Names.add(2, "Consuela");
		
		for(int i = 0; i < Names.size(); i++) {
			System.out.println(Names.get(i));
		}
		

	}

}
