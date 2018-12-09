
public class Test36 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(58, 16, 88);
        System.out.println(bankomat.dvigni(7, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(10, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(14, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(30, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(1, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(10, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(22, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(22, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(21, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(25, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(30, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(21, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(29, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(5, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(40, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(24, datum));
        bankomat.izpisi();
        System.out.println(bankomat.najDvig());
    }
}
