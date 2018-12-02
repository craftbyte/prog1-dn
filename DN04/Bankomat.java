//63180127

import java.util.*;

public class Bankomat {
	private int n5 = 0, n2 = 0, n1 = 0;
	private int najvecjiDvig = 0;
	private Datum najvecjiDatum = null;
	private int najvecjiDatumDvigi = 0;
	private Datum trenutniDatum = null;
	private int danesDvigov = 0;

	public Bankomat() {}

	public int vrniN5() {
		return this.n5;
	}

	public int vrniN2() {
		return this.n2;
	}

	public int vrniN1() {
		return this.n1;
	}

	public void nalozi(int k5, int k2, int k1) {
		this.n5 += k5;
		this.n2 += k2;
		this.n1 += k1;
	}

	public void izpisi() {
		System.out.printf("%d | %d | %d%n", this.n5, this.n2, this.n1);
	}

	public int kolicinaDenarja() {
		int kolicina = 0;
		kolicina += this.n5 * 5;
		kolicina += this.n2 * 2;
		kolicina += this.n1;
		return kolicina;
	}

	public boolean dvigni(int dvig, Datum datum) {
		if (dvig > this.kolicinaDenarja()) return false;
		int[] dDvig = doberDvig(dvig);
		if (dDvig[0] == 0) return false;
		this.n5 -= dDvig[1];
		this.n2 -= dDvig[2];
		this.n1 -= dDvig[3];
		if (dvig > najvecjiDvig) {
			najvecjiDvig = dvig;
		}

		if (trenutniDatum == null || !trenutniDatum.jeEnakKot(datum)) {
			trenutniDatum = datum;
			danesDvigov = 0;
		};
		danesDvigov += dvig;

		if (danesDvigov > najvecjiDatumDvigi) {
			najvecjiDatumDvigi = danesDvigov;
			najvecjiDatum = trenutniDatum;
		}

		return true;
	}

	private int[] doberDvig(int dvig) {
		int remainingN5 = this.n5, remainingN2 = this.n2, remainingN1 = this.n1;
		int withdrawn5 = 0, withdrawn2 = 0, withdrawn1 = 0;
		int skipped5 = 0, skipped2 = 0;
		int remaining = dvig;
		boolean possible = true;
		boolean doingIt = true;
		while (doingIt) {
			remainingN5 = this.n5;
			remainingN2 = this.n2;
			remainingN1 = this.n1;
			remaining = dvig;
			withdrawn5 = 0;
			withdrawn2 = 0;
			withdrawn1 = 0;
			while (remaining >= 5 && remainingN5 > 0) {
				remaining -= 5;
				remainingN5--;
				withdrawn5++;
			}
			remaining += skipped5*5;
			withdrawn5 -= skipped5;
			remainingN5 += skipped5;
			while (remaining >= 2 && remainingN2 > 0) {
				remaining -= 2;
				remainingN2--;
				withdrawn2++;
			}
			remaining += skipped2*2;
			withdrawn2 -= skipped2;
			remainingN2 += skipped2;
			while (remaining > 0 && remainingN1 > 0) {
				remaining--;
				remainingN1--;
				withdrawn1++;
			}
			if (remaining == 0) doingIt = false;
			else {
				skipped5++;
				if (skipped5 > this.n5) {
					skipped5 = 0;
					skipped2++;
				}
				if (skipped2 > this.n2) {
					possible = false;
					doingIt = false;
				};
			};
		}
		return new int[] {possible ? 1 : 0, withdrawn5, withdrawn2, withdrawn1};
	}

	public int najDvig() {
		return najvecjiDvig;
	}

	public Datum najDatum() {
		return najvecjiDatum;
	}
}