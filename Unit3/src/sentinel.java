import java.util.*;
public class sentinel {

	public static void main(String[] args) {
		int sentinel = 0;
		
		Scanner input = new Scanner(System.in);
		while(sentinel == 0) {
			//do whatever
			
			System.out.println("Do you want to continue? 0 for yes, 1 for no");
			sentinel = input.nextInt();
			
		}
		input.close();

	}

}
