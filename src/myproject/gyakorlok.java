package gyakorlok;

public class MetodusokGyak1 {
    public static void main(String[] args) {
        MetodusokGyak1.elso10SzamOsszege();
        MetodusokGyak1.osszead(3, 7);
    }

    private static void elso10SzamOsszege() {
        // összead
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 10;
        }
        //kiir
        MetodusokGyak1.kiir(sprintf("Az első 10 szám összege: " + osszeg));
    }

    private void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    private static void osszead(int a, int b) {
        //összead és kiír
        MetodusokGyak1.kiir(sprintf("%d + %d = %d\n" + a, b, a+b));


    }
}