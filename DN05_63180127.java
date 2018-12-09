import java.util.*;

public class DN05_63180127 {
	public static void main(String[] args) {
		boolean debug = false;
		Scanner input = new Scanner(System.in);
		int noPeople = input.nextInt();
		ArrayList<int[]> people = new ArrayList<int[]>();
		int first = input.nextInt();
		people.add(new int[]{first, 1});
		long sum = 1;
		for (int i = 2; i <= noPeople; i++) {
			int visina = input.nextInt();
			int clen = people.size()-1;
			int zaporedna = i;
			int razlika = zaporedna;
			boolean imaVisjega = false;
			if (debug) System.out.printf("Testing %d(%d):%n", visina, zaporedna);
			do {
				if (debug) System.out.printf("	Current test: %d", clen);
				int[] current = people.get(clen);
				if (debug) System.out.printf(", %s", Arrays.toString(current));
				if (current[0] > visina) {
					imaVisjega = true;
					razlika = zaporedna - current[1];
					for (int j = people.size() - 1; j >= clen-1 ; j--) {
						int[] testClen = people.get(j);
						if (testClen[0] <= visina) people.remove(j);
						else break;
					}
					people.add(new int[] {visina, zaporedna});
				} else clen--;
				if (debug) System.out.printf(", imaVisjega: %s%n", imaVisjega);
			}
			while (!imaVisjega && clen >= 0);
			if (imaVisjega) sum += razlika;
			else {
				sum += zaporedna;
				for (int j = people.size() - 1; j >= 0 ; j--) {
					int[] testClen = people.get(j);
					if (testClen[0] <= visina) people.remove(j);
					else break;
				}
				people.add(new int[] {visina, zaporedna});
			};
			if (debug) System.out.printf("	Current: %d(%d), razlika: %d, imaVisjega: %s SUM: %d %n", visina, zaporedna, razlika, imaVisjega, sum);
		}
		System.out.println(sum);
	}
}