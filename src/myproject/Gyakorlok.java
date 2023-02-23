package Gyakorlok;

public class MetodusokGyak1 {
    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();

        kiir("Az első 10 szám összege: " + osszeg);
        int a = 3, b = 7;
        osszeg = osszead(a, b);
        kiir("%d + %d = %d\n".formatted(a, b, osszeg));
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