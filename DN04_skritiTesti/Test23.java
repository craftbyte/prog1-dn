
public class Test23 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(7, 6, 3);
        bankomat.nalozi(3, 5, 2);
        bankomat.nalozi(10, 1, 10);
        bankomat.izpisi();
        System.out.println(bankomat.kolicinaDenarja());
    }
}
