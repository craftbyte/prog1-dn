
public class Test39 {

    public static void main(String[] args) {
        Datum datum = new Datum(1, 1, 2018);
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(60, 17, 58);
        System.out.println(bankomat.dvigni(22, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(25, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(39, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(10, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(23, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(15, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(18, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(14, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(9, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(29, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(35, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(19, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(34, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(34, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(6, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(33, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(27, datum));
        bankomat.izpisi();
        System.out.println(bankomat.dvigni(38, datum));
        bankomat.izpisi();
        System.out.println(bankomat.najDvig());
    }
}
