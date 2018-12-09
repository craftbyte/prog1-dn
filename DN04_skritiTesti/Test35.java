
public class Test35 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(88, 5, 39);
        System.out.println(bankomat.dvigni(21, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(39, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(24, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(36, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(22, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(8, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(45, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(46, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(18, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(39, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(46, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(13, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(44, datum));
        bankomat.izpisi();
    }
}
