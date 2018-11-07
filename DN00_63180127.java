import java.util.Scanner;

public class DN00_63180127 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int candy = input.nextInt();
		int friends = input.nextInt();
		System.out.println(candy/friends);
		System.out.println(candy%friends);
	}
}