
public class Test21 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(4, 0, 10);
        bankomat.izpisi();
        System.out.println(bankomat.kolicinaDenarja());
    }
}
