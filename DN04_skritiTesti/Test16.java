
public class Test16 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 8, 8);
        System.out.println(bankomat.vrniN5());
        System.out.println(bankomat.vrniN2());
        System.out.println(bankomat.vrniN1());
    }
}
