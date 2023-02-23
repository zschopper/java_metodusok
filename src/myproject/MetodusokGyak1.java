package myproject;

public class MetodusokGyak1 {

    public static void main(String[] args) {
        szamolasok();
    }

    public static void szamolasok() {
        elso10SzamOsszegKiir();
        szamok_osszeadasa();
        gyokvonas_osszegbol();
    }

    public static void elso10SzamOsszegKiir() {
        int osszeg = elso10SzamOsszege();
        kiir("Az első 10 szám összege: " + osszeg);
    }

    public static void szamok_osszeadasa() {
        int[] szamok = new int[]{1, 2, 3, 4};
        int osszeg = osszead(szamok);
        kiir("A megadott számok összege: %d\n".formatted(osszeg));
    }

    public static void gyokvonas_osszegbol() {
        int[] szamok = new int[]{1, 2, 3, 4};
        double gyok = gyokvonas(szamok);
        kiir("A megadott számok összegének gyöke: %.4f\n".formatted(gyok));
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int[] szamok) {
        int osszeg = 0;
        for (int szam: szamok) {
            osszeg += szam;
        }
        return osszeg;
    }

    private static double gyokvonas(int[] szamok) {
        int osszeg = osszead(szamok);
        return Math.sqrt(osszeg);
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}