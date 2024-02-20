public class Ucgen extends Sekil {

    private int a; // Ekstra özellik olarak tanımladık. Üçgenin kenarlarını yazdık.  //  5
    private int b; // Ekstra özellik olarak tanımladık. Üçgenin kenarlarını yazdık.  //  5
    private int c; // Ekstra özellik olarak tanımladık. Üçgenin kenarlarını yazdık.  //  5

    public Ucgen(String isim, int a, int b, int c) { // Sekil abstract class'ından constructor yazdırdık. Sağ Click>Generate ile  //  7
        super(isim);
        this.a = a; //  8
        this.b = b; //  9
        this.c = c; //  10
    }


    @Override
    public void alanHesapla() { // Sekil abstract class'ından metod override yaptık.  //  6   // Başına public ekledik  //  16
        double u = (a + b + c) / 2.0; //  11

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)); //  12
        System.out.println(getIsim() + " in alanı " + alan); //  15

    }
}
