import java.util.Scanner;

public class DN03_63180127 {
	private static int prostiInterval, praznicniInterval, stDniVMesecu, stDniVTednu;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// staticne spremenljivke
		int stMesecevVLetu = input.nextInt();
		stDniVMesecu = input.nextInt();
		stDniVTednu = input.nextInt();
		prostiInterval = input.nextInt();
		praznicniInterval = input.nextInt();
		int zacMesec = input.nextInt();
		int zacLeto = input.nextInt();
		int koncMesec = input.nextInt();
		int koncLeto = input.nextInt();
		//dinamicne spremenljivke
		int mesec = stMesecevVLetu * (zacLeto - 1) + zacMesec - 1;
		int zadnjiMesec = stMesecevVLetu * (koncLeto - 1) + koncMesec;
		int leto = zacLeto;

		while (leto <= koncLeto) {
			while (mesec < zadnjiMesec && mesec < (stMesecevVLetu * leto)) {
				System.out.printf("%d/%d%n", (mesec % stMesecevVLetu) + 1, leto);
				int prviDan = mesec * stDniVMesecu;
				izpisiMesec(prviDan);
				mesec++;
			}
			leto++;
		}
	}

	private static char znakZaDan(int dan) {
		if ((dan + 1) % praznicniInterval == 0 && (danVTednu(dan) + 1) % prostiInterval == 0) return '*';
		else if ((dan + 1) % praznicniInterval == 0) return '+';
		else if ((danVTednu(dan) + 1) % prostiInterval == 0) return 'x';
		return '_';
	}

	private static void izpisiMesec(int zacetniDan) {
		int zamik = danVTednu(zacetniDan);
		for (int i = 0; i < zamik; i++) {
			System.out.print("     ");
		}
		for (int dan = zacetniDan; dan < (stDniVMesecu + zacetniDan); dan++) {
			System.out.printf("%4d%c", (dan % stDniVMesecu) + 1, znakZaDan(dan));
			if (danVTednu(dan) == stDniVTednu - 1 && dan < (stDniVMesecu + zacetniDan) - 1) System.out.println();
		}
		System.out.println();
	}

	private static int danVTednu(int dan) {
		return (dan % stDniVTednu);
	}
}