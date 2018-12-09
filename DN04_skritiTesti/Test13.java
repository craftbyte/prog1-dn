
public class Test13 {

    public static void main(String[] args) {
        Datum datum1 = new Datum(18, 1, 2094);
        Datum datum2 = new Datum(25, 1, 1932);
        Datum datum3 = new Datum(18, 1, 2094);
        Datum datum4 = new Datum(25, 1, 1932);
        Datum datum5 = new Datum(11, 12, 2052);
        System.out.println(datum4.jeEnakKot(datum3));
        System.out.println(datum3.jeEnakKot(datum2));
        System.out.println(datum2.jeEnakKot(datum4));
        System.out.println(datum5.jeEnakKot(datum4));
        System.out.println(datum2.jeEnakKot(datum5));
        System.out.println(datum5.jeEnakKot(datum1));
        System.out.println(datum5.jeEnakKot(datum1));
        System.out.println(datum4.jeEnakKot(datum4));
        System.out.println(datum1.jeEnakKot(datum4));
        System.out.println(datum5.jeEnakKot(datum5));
    }
}
