
public class Test01 {

    public static void main(String[] args) {
        Datum datum = new Datum(22, 6, 2008);
        System.out.println(datum.vrniDan());
        System.out.println(datum.vrniMesec());
        System.out.println(datum.vrniLeto());
    }
}
