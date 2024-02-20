public abstract class Sekil { //  1

    private String isim; // Bütün şekillerin ortak ismi olacak bu özellik. //  2

    public Sekil(String isim) { //  3
        this.isim = isim;
    }

    public String getIsim() { //  14
        return isim;
    }

    public void setIsim(String isim) { //  14
        this.isim = isim;
    }

    abstract void alanHesapla(); //  abstract metodumuzu da yazdık. Alt classlarda tanımlayacağız.  //  4

}
