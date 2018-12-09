
public class Test22 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(9, 6, 0);
        bankomat.nalozi(7, 10, 10);
        bankomat.izpisi();
        System.out.println(bankomat.kolicinaDenarja());
    }
}
