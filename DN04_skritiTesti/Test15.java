
public class Test15 {

    public static void main(String[] args) {
        Datum datum1 = new Datum(1, 11, 1912);
        Datum datum2 = new Datum(4, 4, 2088);
        Datum datum3 = new Datum(1, 11, 1912);
        Datum datum4 = new Datum(1, 11, 1912);
        Datum datum5 = new Datum(4, 4, 2088);
        System.out.println(datum4.jeEnakKot(datum2));
        System.out.println(datum2.jeEnakKot(datum1));
        System.out.println(datum2.jeEnakKot(datum5));
        System.out.println(datum4.jeEnakKot(datum2));
        System.out.println(datum5.jeEnakKot(datum3));
        System.out.println(datum4.jeEnakKot(datum1));
        System.out.println(datum1.jeEnakKot(datum2));
        System.out.println(datum1.jeEnakKot(datum3));
        System.out.println(datum1.jeEnakKot(datum1));
        System.out.println(datum1.jeEnakKot(datum1));
    }
}
