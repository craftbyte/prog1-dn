
public class Test27 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 0, 2);
        System.out.println(bankomat.dvigni(1, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(1, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(1, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
    }
}
