import java.util.Scanner;

public class DN01_63180127 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Poberemo podatke
		int periods = input.nextInt();
		int wavelength = input.nextInt();
		int amplitude = input.nextInt();
		int phase = input.nextInt();
		//Ustvarimo tabelo v katero bomo shranjevali grafiko
		char[][] wave = new char[amplitude+1][periods*wavelength];
		//V tabelo vstavimo osnovno zgradbo
		for (int i = 0; i < wave.length; i++) {
			for (int j = 0; j < wave[i].length; j++) {
				wave[i][j] = ' ';
			}
		}
		//Zanko ponavljamo po periodah
		for (int period = 0; period < periods; period++) {
			//Nastavimo zamik
			int offset = period * wavelength;
			//Gremo po stolpcih
			for (int i = offset; i < offset + wavelength; i++) {
				//Ce je stolpec na polovici (preklop vala) narisemo preklop
				if (i == (offset + wavelength/2 - 1) || i == (offset + wavelength - 1)) {
					//Narisemo navpicne crte razen v prvi in zadnji vrsti
					for (int j = 1; j < amplitude; j++) {
						wave[j][i] = '|';
					}
					//Dodamo plusa v prvo in zadnjo vrsto
					wave[0][i] = '+';
					wave[amplitude][i] = '+';
					//ce je preklop minusov ne risemo
					continue;
				}
				//Preverimo, ali smo v zgornjem ali spodnjem delu vala
				int row = i <= offset + wavelength/2-1 ? 0 : amplitude;
				//Narisemo minus
				wave[row][i] = '-';
			}
		}
		//Ce imamo fazni zamik
		if (phase > 0) {
			//Sprehodimo se po vrsticah
			for (int row = 0; row <= amplitude; row++) {
				//Shranimo staro vrstico in naredimo prazno novo
				char[] old = wave[row];
				char[] shifted = new char[old.length];
				//Kopiramo vse od zamika naprej na zacetek
				System.arraycopy(old, phase, shifted, 0, old.length - phase);
				//Kopiramo zacetek na konec
				System.arraycopy(old, 0, shifted, old.length - phase, phase);
				//Posodobimo glavno tabelo
				wave[row] = shifted;
			}
		}
		//Izpisemo po vrsticah in stolpcih
		for (int i = 0; i < wave.length; i++) {
			for (int j = 0; j < wave[i].length; j++) {
				System.out.print(wave[i][j]);
			}
			System.out.println();
		}
	}
}