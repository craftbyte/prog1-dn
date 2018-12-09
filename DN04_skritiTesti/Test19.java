
public class Test19 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 6, 8);
        bankomat.nalozi(8, 7, 9);
        bankomat.nalozi(6, 6, 10);
        bankomat.nalozi(8, 4, 7);
        System.out.println(bankomat.vrniN5());
        System.out.println(bankomat.vrniN2());
        System.out.println(bankomat.vrniN1());
    }
}
