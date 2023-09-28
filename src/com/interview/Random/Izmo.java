import java.util.Scanner;


public class Izmo {
	public static void main(String[] args) {
		int first,second;
		
		Scanner input = new Scanner(System.in);
		System.out.println("specify first: ");
		first = input.nextInt();
		System.out.println("specify second: ");
		second = input.nextInt();
		
		for (int i = 0; i < first; i++) {
			System.out.println(i);
			for (int j = 0; j < second; j++) {
				System.out.println(j);
			}
			System.out.println("----");
		}
	}
}
