
public class Test18 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(5, 3, 1);
        bankomat.nalozi(7, 1, 9);
        bankomat.nalozi(3, 6, 9);
        System.out.println(bankomat.vrniN5());
        System.out.println(bankomat.vrniN2());
        System.out.println(bankomat.vrniN1());
    }
}
