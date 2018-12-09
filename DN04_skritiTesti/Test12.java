
public class Test12 {

    public static void main(String[] args) {
        Datum datum1 = new Datum(17, 10, 2082);
        Datum datum2 = new Datum(22, 9, 1912);
        Datum datum3 = new Datum(22, 9, 1912);
        Datum datum4 = new Datum(22, 9, 1912);
        Datum datum5 = new Datum(27, 3, 2086);
        System.out.println(datum3.jeEnakKot(datum2));
        System.out.println(datum3.jeEnakKot(datum2));
        System.out.println(datum5.jeEnakKot(datum2));
        System.out.println(datum2.jeEnakKot(datum2));
        System.out.println(datum2.jeEnakKot(datum4));
        System.out.println(datum4.jeEnakKot(datum2));
        System.out.println(datum3.jeEnakKot(datum3));
        System.out.println(datum1.jeEnakKot(datum4));
        System.out.println(datum3.jeEnakKot(datum1));
        System.out.println(datum5.jeEnakKot(datum1));
    }
}
