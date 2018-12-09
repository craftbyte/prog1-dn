
public class Test40 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(29, 41, 36);
        System.out.println(bankomat.dvigni(1, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(21, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(14, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(21, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(25, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(13, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(7, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(7, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(11, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(25, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(20, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(17, datum));
        bankomat.izpisi();
        System.out.println(bankomat.najDvig());
    }
}
