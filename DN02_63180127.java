import java.util.Scanner;

public class DN02_63180127 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int command = input.nextInt();
		switch (command) {
			case 1:
				System.out.println(input.nextInt());
				break;
			case 2:
				int number = input.nextInt();
				while (input.hasNextInt()) {
					number = input.nextInt();
				}
				System.out.println(number);
				break;
			case 3:
				int num1 = 0;
				int num2 = 0;
				while (input.hasNextInt()) {
					num1 = num2;
					num2 = input.nextInt();
				}
				System.out.println(num1+num2);
				break;
			case 4:
				int counter = 1;
				int previous4 = input.nextInt();
				while (input.hasNextInt()) {
					int current = input.nextInt();
					if (current >= previous4) counter++;
					else break;
					previous4 = current;
				}
				System.out.println(counter);
				break;
			case 5:
				int curCounter = 1;
				int maxCounter = 1;
				int previous5 = input.nextInt();
				while (input.hasNextInt()) {
					int current = input.nextInt();
					if (current > previous5) curCounter++;
					else if (current < previous5) curCounter = 1;
					if (curCounter > maxCounter) maxCounter = curCounter;
					previous5 = current;
				}
				System.out.println(maxCounter);
				break;
		}
	}
}