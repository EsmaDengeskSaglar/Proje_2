package School_Project;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgretmenManager extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogretmenMenu() throws InterruptedException {

        // TODO ogretmenMenu() methodundaki eksiklikleri tamamlayiniz

        String secim;
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "================= OGRETMEN MENU =================\n" +
                        "\n" +
                        "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                        "\t   2- Soyisimden Ogretmen Bulma\n" +
                        "\t   3- Branstan Ogretmen Bulma\n" +
                        "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                        "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                        "\t   A- ANAMENU\n" +
                        "\t   Q- CIKIS\n");

        secim = scan.nextLine().toUpperCase();

        //do while döngüde kalmayı sağlar, switch veya if menülere yönlenmeyi sağlar...
        do {

            // ÇIKIŞ YAPILMADIĞI SÜRECE ANA MENÜ VEYA ALT MENÜLER ARASINDA DOLAŞILABİLMELİ.
            // AŞAĞIDAKİ METODLARIN BULUNDUĞU YERE GİDEREK, İLGİLİ METODU TANIMLAYINIZ...
            // CTRL + SOL tık LA METODLAR ARASINDA DOLAŞABİLİRSİNİZ.

            switch (secim) {
                case "1": // Ogretmenler Listesi Yazdir.
                    ogretmenListesiYazdir();
                    break;

                case "2": // Soyisimden Ogretmen Bulma
                    soyisimdenOgretmenBulma();
                    break;

                case "3": // Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;

                case "4": // Bilgilerini Girerek Ogretmen Ekleme
                    ogretmenEkleme();
                    break;

                case "5": // Kimlik No Ile Kayit Silme
                    tcNoIleOgretmenSil();
                    break;

                case "A": // Ana Menü Metodu Çağrılabilmeli
                    Helper.anaMenu();
                    break;

                case "Q": // Çıkış yapılabilmeli

                    //   HATALI TERCİH DURUMUNDA TEKRAR SEÇİM İSTENMELİ
                    System.out.println("Lutfen gecerli tercih yapiniz:");
            }

            // ÇIKIŞ YAPILIRSA
            Helper.projeDurdur();
        } while (!secim.equalsIgnoreCase("Q"));
    }

    public static void tcNoIleOgretmenSil() throws InterruptedException {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);
        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        System.out.print(silinecekOgretmen + " Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        //////////////////////////////////////////////////////////////////////////////
        // BU BLOĞU DEĞİŞTİRMEYİN, DİKKATE ALMAYIN...                               //
        // SİLİNECEK KİMLİK NO YOKSA VEYA BAŞKA BEKLENMEDİK                         //
        // ŞEYLER OLURSA KODUN DEVAMINI SAĞLAYACAK...
        try {                                                                       //
            boolean sonuc = sonucValue.equals(silinecekValue);                      //
        } catch (Exception e) {                                                     //
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");  //
        }                                                                           //
        //////////////////////////////////////////////////////////////////////////////
    }

    ///////////////////////////////////////////////////////////////

    // TODO ogretmenEkleme() methodunu doldurunuz
    public static void ogretmenEkleme() {

        System.out.println("TC no:");
        String TCno = scan.nextLine();
        System.out.println("Ad:");
        String aD = scan.nextLine();
        System.out.println("Soyad:");
        String soyAd = scan.nextLine();
        System.out.println("Dogum yılı:");
        String dogumYili = scan.nextLine();
        System.out.println("DersAdi:");
        String dersAdi = scan.nextLine();


        String key = TCno;
        String value = aD + ", " + soyAd + ", " + dogumYili + ", ";
        ogretmenlerMap.put(key, value);


    }

    // TODO Bu methodu degistirmeyiniz.
    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz Ogretmenin Bransini Giriniz:");
        String istenenBrans = scan.nextLine();

        System.out.print(istenenBrans + " Ogretmenleri Listeleniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "============BRANS ILE OGRETMEN ARAMA ============\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        // Daha düzgün bi görünüm için printf veya String.format kullanılabilir... İsteğe bağlı
        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValuarr = eachValue.split(", ");
            if (istenenBrans.equalsIgnoreCase(eachValuarr[3])) {
                System.out.println(eachKey + " : " + eachValue + " | ");
            }
        }
    }

    ///////////////////////////////////////////////////////////////

    // TODO soyisimdenOgretmenBulma() methodunu doldurunuz
    public static void soyisimdenOgretmenBulma() throws InterruptedException {

        System.out.println("Soyisim giriniz:");
        String soyisim = scan.nextLine();

        for (Map.Entry<String, String> entry : ogretmenlerMap.entrySet()) {
            if (entry.getValue().contains(soyisim)) {
                System.out.println("Ögretmenler Bilgileri: " + entry.getKey() + " - " + entry.getValue());


            }
        }
    }

    ///////////////////////////////////////////////////////////////

    // TODO ogretmenListesiYazdir() methodunu doldurunuz
    public static void ogretmenListesiYazdir() throws InterruptedException {


        Set<Map.Entry<String, String>> EntrySet = ogretmenlerMap.entrySet();
        System.out.println("Ögretmenler Listesi");
        for (Map.Entry<String, String> Liste : EntrySet) {
            String Listekey = Liste.getKey();
            String ListeValue = Liste.getValue();
            System.out.println(Listekey + ":" + ListeValue);


        }
    }

}

