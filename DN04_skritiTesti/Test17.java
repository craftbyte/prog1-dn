
public class Test17 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(7, 10, 2);
        bankomat.nalozi(6, 2, 2);
        System.out.println(bankomat.vrniN5());
        System.out.println(bankomat.vrniN2());
        System.out.println(bankomat.vrniN1());
    }
}
