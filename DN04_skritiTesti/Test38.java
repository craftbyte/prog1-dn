
public class Test38 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(86, 16, 12);
        System.out.println(bankomat.dvigni(24, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(19, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(23, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(25, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(46, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(23, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(14, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(26, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(7, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(20, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(32, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(36, datum));
        bankomat.izpisi();
        System.out.println(bankomat.najDvig());
    }
}
