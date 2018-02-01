
public class Fencepost {

	public static void main(String[] args) {
		// print numbers 1 through 5, separated by commas
		for(int i = 1; i < 5; i++) {
			System.out.print(i + ", ");
		}
		System.out.print("5");
		System.out.println();
		
		System.out.print("1");
		for(int j = 2; j<=5; j++) {
			System.out.print(", " + j);
		}
		
		System.out.println();
		
		for(int k = 1;k <= 5; k++) {
			System.out.print(k);
			if(k < 5) {
				System.out.print(", ");
				
			}
		}
	}

}
