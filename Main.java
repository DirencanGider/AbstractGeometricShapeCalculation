import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //  29

        Scanner scanner = new Scanner(System.in); //  30

        String islemler = "İşlemler...\n" //  31
                            +"1. Kare Alan Hesapla\n"
                            +"2. Üçgen Alan Hesapla\n"
                            +"3. Daire Alan Hesapla\n"
                            +"Çıkış : q";

        while (true) { //  32
            System.out.println("***********************************************");
            System.out.println(islemler); //  33
            System.out.println("***********************************************");
            System.out.println("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz : ");
            String sekil_turu = scanner.nextLine();

            Sekil sekil = null; // Şekil referansını oluşturduk fakat herhani bir yeri göstermesin diye null olarak tanımladık.  //  36

            if (sekil_turu.equals("q")) { // 34
                System.out.print("Programdan çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")) { //  35
                System.out.println("Karenin Kenarını Giriniz : "); //  37
                int kenar = scanner.nextInt(); // 38
                scanner.nextLine(); //  39

                sekil = new Kare("Kare 1", kenar); /* Yukarıda oluşturduğumuz ve null atadığımız sekil referansında
                                                          Kare objesini eşitledik. */ //  40

                sekil.alanHesapla(); //  Burada sekil abstract class'ı kare gibi davranacak. Polymorphism kullandık.  //  41

            }
            else if (sekil_turu.equals("2")) { //  42

                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();

                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();

                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3); // sekil referansına Ucgen objesini eşitledik.  //  43

                sekil.alanHesapla(); //  44

            }
            else if (sekil_turu.equals("3"))  { //  45

                System.out.print("Dairenin Yarıçapını Giriniz : ");

                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire 1" , yaricap); // sekil referansına Daire objesini eşitledik.  //  46

                sekil.alanHesapla();


            }
            else {

                System.out.println("Geçersiz İşlem...");



            }

        }


    }

}
