//63180127

import java.util.*;

public class Datum {
	private GregorianCalendar dejanski;

	public Datum(int dan, int mesec, int leto) {
		dejanski = new GregorianCalendar(leto, mesec, dan);
	}

	public int vrniDan() {
		return dejanski.get(Calendar.DAY_OF_MONTH);
	}

	public int vrniMesec() {
		return dejanski.get(Calendar.MONTH);
	}

	public int vrniLeto() {
		return dejanski.get(Calendar.YEAR);
	}

	public String toString() {
		return String.format("%02d.%02d.%d", dejanski.get(Calendar.DAY_OF_MONTH), dejanski.get(Calendar.MONTH), dejanski.get(Calendar.YEAR));
	}

	public boolean jeEnakKot(Datum datum) {
		return (dejanski.equals(datum.dejanski));
	}
}