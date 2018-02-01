import java.util.*;
public class SentinelPractice {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		int sentinel = -1;
		int sum = 0;
		int value = input.nextInt();
		while(value != sentinel) {
			sum+= value;
			System.out.println(sum + " " + value);
			value = input.nextInt();
		}
		System.out.println("The final sum is " + sum);
		input.close();
	}
	

}
