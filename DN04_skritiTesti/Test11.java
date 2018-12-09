
public class Test11 {

    public static void main(String[] args) {
        Datum datum1 = new Datum(15, 11, 1968);
        Datum datum2 = new Datum(15, 11, 1968);
        Datum datum3 = new Datum(27, 2, 2050);
        Datum datum4 = new Datum(15, 11, 1968);
        Datum datum5 = new Datum(20, 2, 1995);
        System.out.println(datum4.jeEnakKot(datum2));
        System.out.println(datum3.jeEnakKot(datum1));
        System.out.println(datum5.jeEnakKot(datum4));
        System.out.println(datum4.jeEnakKot(datum5));
        System.out.println(datum3.jeEnakKot(datum2));
        System.out.println(datum2.jeEnakKot(datum3));
        System.out.println(datum3.jeEnakKot(datum4));
        System.out.println(datum5.jeEnakKot(datum3));
        System.out.println(datum1.jeEnakKot(datum2));
        System.out.println(datum5.jeEnakKot(datum1));
    }
}
