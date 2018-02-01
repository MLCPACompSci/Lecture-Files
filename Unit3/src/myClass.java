import java.util.*;

public class myClass {

	public static void main(String[] args) {
		Random rando = new Random();
		int result = rando.nextInt(100) + 1;
		double randDouble = rando.nextDouble();
		boolean Boole = rando.nextBoolean();
		int d20 = rando.nextInt(20) + 1;
		int evens = rando.nextInt(51) * 2;
	}

}
