
public class Test14 {

    public static void main(String[] args) {
        Datum datum1 = new Datum(11, 6, 2089);
        Datum datum2 = new Datum(7, 6, 2035);
        Datum datum3 = new Datum(11, 6, 2089);
        Datum datum4 = new Datum(12, 6, 2010);
        Datum datum5 = new Datum(7, 6, 2035);
        System.out.println(datum5.jeEnakKot(datum3));
        System.out.println(datum1.jeEnakKot(datum4));
        System.out.println(datum4.jeEnakKot(datum2));
        System.out.println(datum3.jeEnakKot(datum5));
        System.out.println(datum5.jeEnakKot(datum2));
        System.out.println(datum1.jeEnakKot(datum4));
        System.out.println(datum4.jeEnakKot(datum4));
        System.out.println(datum4.jeEnakKot(datum5));
        System.out.println(datum4.jeEnakKot(datum4));
        System.out.println(datum5.jeEnakKot(datum2));
    }
}
