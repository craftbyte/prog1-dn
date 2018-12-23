import java.util.*;

public class DN07_63180127 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int stPostaj = in.nextInt();
		int[] razdalje = fillUp(in, stPostaj - 1);
		int stRazlicnih = in.nextInt();
		int[][] razlicni = getTimes(in, stRazlicnih);
		int celaPot = razdalje[0];
		int[] brezZamika = new int[stPostaj];
		int[] brezZamikb = new int[stPostaj];
		int[] cakanje = new int[stPostaj];
		brezZamika[0] = 0;
		brezZamikb[stPostaj - 1] = 0;
		for (int i = 0; i < razdalje.length; i++) {
			celaPot += razdalje[i];
			brezZamika[i+1] = brezZamika[i] + razdalje[i];
			brezZamikb[brezZamikb.length - 2 - i] = brezZamikb[brezZamikb.length - 1 - i] + razdalje[stPostaj - 2 - i];
		}
		for (int i = 0; i < stPostaj; i++) {
			cakanje[i] = brezZamika[i] - brezZamikb[i];
		}
		int vsota = 0;
		for (int[] start: razlicni) {
			if (Math.abs(start[0]-start[1]) > celaPot) continue;
			int diferenca = start[1] - start[0];
			int index = Arrays.binarySearch(cakanje, diferenca);
			if (index >= 0) continue;
			else {
				index = - index - 1;
				int levi = 0;
				int desni = 0;
				boolean left = false;
				boolean right = false;
				if (index > 0) {
					levi = Math.abs(cakanje[index-1] - diferenca);
					left = true;
				}
				if (index != cakanje.length) {
					desni = Math.abs(cakanje[index] - diferenca);
					right = true;
				}
				if (left && right) vsota += levi > desni ? desni : levi;
				else if (right && !left) vsota += desni;
				else vsota += levi;
			}
		}
		System.out.println(vsota);
	}	

	public static int[] fillUp(Scanner in, int n) {
		int [] result = new int[n];
		for (int i = 0; i<n; i++) {
			result[i] = in.nextInt();
		}
		return result;
	}

	public static int[][] getTimes(Scanner in, int n) {
		int[][] result = new int [n][2];
		for (int i = 0; i < n; i++) {
			result[i][0] = in.nextInt();
			result[i][1] = in.nextInt();
		}
		return result;
	}

}