
public class Test24 {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.nalozi(5, 10, 1);
        bankomat.nalozi(3, 3, 3);
        bankomat.nalozi(2, 1, 0);
        bankomat.nalozi(1, 8, 2);
        bankomat.izpisi();
        System.out.println(bankomat.kolicinaDenarja());
    }
}
