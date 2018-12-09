
public class Test32 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 0, 70);
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(7, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(3, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(2, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(10, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(4, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(8, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(10, datum));
        bankomat.izpisi();
    }
}
