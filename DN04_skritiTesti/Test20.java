
public class Test20 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 4, 2);
        bankomat.nalozi(7, 2, 6);
        bankomat.nalozi(4, 10, 7);
        bankomat.nalozi(7, 1, 10);
        bankomat.nalozi(5, 4, 2);
        System.out.println(bankomat.vrniN5());
        System.out.println(bankomat.vrniN2());
        System.out.println(bankomat.vrniN1());
    }
}
