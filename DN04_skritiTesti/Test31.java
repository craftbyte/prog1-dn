
public class Test31 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(77, 35, 0);
        System.out.println(bankomat.dvigni(31, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(31, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(12, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(41, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(8, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(28, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(24, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(18, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(19, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(14, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(41, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(32, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(19, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(22, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(8, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(18, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
    }
}
