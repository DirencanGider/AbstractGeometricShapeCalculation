public class Kare extends Sekil { //  17

    private int kenar; //  20

    public Kare(String isim, int kenar) { //  19
        super(isim);
        this.kenar = kenar; //  21
    }

    @Override
    public void alanHesapla() { //  18

        System.out.println(getIsim() + " in alanı : " + (kenar * kenar)); //  22


    }
}
