
public class Test25 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(6, 2, 4);
        bankomat.nalozi(3, 1, 1);
        bankomat.nalozi(5, 1, 6);
        bankomat.nalozi(6, 0, 1);
        bankomat.nalozi(0, 9, 7);
        bankomat.izpisi();
        System.out.println(bankomat.kolicinaDenarja());
    }
}
