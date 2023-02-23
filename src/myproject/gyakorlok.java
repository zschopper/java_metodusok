package gyakorlok;

public class MetodusokGyak1 {
    public static void main(String[] args) {
        int osszeg = MetodusokGyak1.elso10SzamOsszege();

        MetodusokGyak1.kiir("Az első 10 szám összege: " + osszeg);
        int a = 3, b = 7;
        osszeg = MetodusokGyak1.osszead(a, b);
        MetodusokGyak1.kiir(printf("%d + %d = %d\n" + a, b, osszeg));
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 10;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a + b;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}