package School_Project;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgrenciManager extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() throws InterruptedException {

        // TODO  Bu menunun calismasi icin gerekli duzenlemeleri yapiniz

        //do while döngüde kalmayı sağlar, switch veya if menülere yönlenmeyi sağlar...


        String secim;
        do {


            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "================== OGRENCI MENU =================\n" +
                            "\t   1- Ogrenci Listesi Yazdir\n" +
                            "\t   2- Soyisimden Ogrenci Bulma\n" +
                            "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                            "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                            "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                            "\t   A- ANAMENU\n" +
                            "\t   Q- CIKIS");

            secim = scan.nextLine().toUpperCase();

            switch (secim) {


                case "1":
                    ogrenciListeYazdir();
                    break;

                case "2": // Soyisimden Ogrenci Bulma
                    soyisimdenOgrenciBulma();
                    break;

                case "3": // Sinif ve Sube Ile Ogrenci Bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;

                case "4": // Bilgilerini Girerek Ogrenci Ekleme
                    ogrenciEkle();
                    break;

                case "5":
                    tcNoIleOgrenciSilme();
                    break;

                case "A":
                    Helper.anaMenu();
                    break;

                case "Q":
                    Helper.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz:");
                    //   HATALI TERCİH DURUMUNDA TEKRAR SEÇİM İSTENMELİ


            }
        }
        while (!secim.equalsIgnoreCase("Q"));

        // ÇIKIŞ YAPILIRSA
        Helper.projeDurdur();

    }

    private static void tcNoIleOgrenciSilme() throws InterruptedException {
        System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);
        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        System.out.print(silinecekOgrenci + "Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        //  Programın çalışmaya devam etmesi için gerekli
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz TC numarasi ile ogrenci bulunamadi");
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO ogrenciEkle() methodunu doldurunuz
    private static void ogrenciEkle() {
        System.out.println("TC no:");
        String TCno = scan.nextLine();
        System.out.println("Ad:");
        String aD = scan.nextLine();
        System.out.println("Soyad:");
        String soyAd = scan.nextLine();
        System.out.println("Dogum yılı:");
        String dogumYili = scan.nextLine();
        System.out.println("OkulNo:");
        String okulNo = scan.nextLine();
        System.out.println("Sınıf:");
        String siniF = scan.nextLine();
        System.out.println("Sube:");
        String sube = scan.nextLine();

        String key = TCno;
        String value = aD + ", " + soyAd + ", " + dogumYili + ", " + okulNo + ", " + siniF + ", " + sube;
        ogrenciMap.put(key, value);


    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO sinifVeSubeIleOgrenciBulma() methodunu doldurunuz
    // OgretmenManager classindaki branstanOgretmenBulma() methodundan faydalanabilirsiniz
    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {

        System.out.println("Sinif:");
        String sinif = scan.nextLine();
        System.out.println("Sube:");
        String sube = scan.nextLine();

        for (Map.Entry<String, String> entry : ogrenciMap.entrySet()) {
            String[] ogrenciBilgileri = entry.getValue().split(", ");
            if (ogrenciBilgileri[4].equalsIgnoreCase(sinif) && ogrenciBilgileri[5].equalsIgnoreCase(sube)) {
                System.out.println("Öğrenci Bilgileri: " + entry.getKey() + " - " + entry.getValue());

            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO soyisimdenOgrenciBulma() methodunu doldurunuz

    private static void soyisimdenOgrenciBulma() throws InterruptedException {

        System.out.println("Soyisim giriniz:");
        String soyisim = scan.nextLine();

        for (Map.Entry<String, String> entry : ogrenciMap.entrySet()) {
            if (entry.getValue().contains(soyisim)) {
                System.out.println("Öğrenci Bilgileri: " + entry.getKey() + " - " + entry.getValue());

            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO ogrenciListeYazdir() methodunu doldurunuz
    private static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> EntrySet = ogrenciMap.entrySet();
        System.out.println("Ogrenciler Listesi");
        for (Map.Entry<String, String> Liste : EntrySet) {
            String Listekey = Liste.getKey();
            String ListeValue = Liste.getValue();
            System.out.println(Listekey + ":" + ListeValue);
        }


    }

}

