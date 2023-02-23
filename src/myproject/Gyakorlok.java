package Gyakorlok;

public class MetodusokGyak1 {

    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();

        kiir("Az első 10 szám összege: " + osszeg);
        int[] szamok = new int[]{3, 7, 10};
        osszeg = osszead(szamok);
        kiir("A megadott számok összege: %d\n".formatted(osszeg));
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int[] szamok) {
        int osszeg = 0
        for (szam: szamok) {
            osszeg += szam;
        }
        return osszeg;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}