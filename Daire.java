public class Daire extends Sekil { //  23

    private int yaricap; //  26

    public Daire(String isim, int yaricap) { //  25
        super(isim);
        this.yaricap = yaricap; //  27
    }

    @Override
    public void alanHesapla() { //  24

        System.out.println(getIsim() + " in alanı : " + (Math.PI * (yaricap * yaricap))); //  28

    }


}
