package BookStore_Project;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    private Scanner scannerDoub = new Scanner(System.in);



    public void kitapEkle() {
        // TODO: kitapEkle() methodunu doldurunuz
        // Kullanıcıdan Kitap Adı, Yazar Adı, Yayın Yılı (int) ve Fiyat (double) bilgisini alarak,
        // itapListesine ekleyen metodu yazınız.
        // NOT: Kullanıcıdan aldığınız bilgilerle bir kitap nesnesi oluşturmayı unutmayınız.

        System.out.println("Kitap Adi giriniz:");
        String kitapAdi= scannerStr.nextLine();

        System.out.println("Yazar Adı giriniz:");
        String yazarAdi=scannerStr.nextLine();

        System.out.println("Yayın yılı giriniz:");
        int yayinYili= scannerInt.nextInt();

        System.out.println("Fiyat giriniz:");
        double fiyat= scannerDoub.nextDouble();

        Kitap k= new Kitap(kitapAdi,yazarAdi,yayinYili,fiyat);
        kitapListesi.add(k);
        System.out.println("Kitap başarıyla eklendi");
    }
    //////////////////////////////////////////////////
    public void kitapSil() {

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int silinecekKitapNo= scannerInt.nextInt();

     //   boolean kitapBulundu=false;
        for (Kitap k  :kitapListesi) {
            if (k.getKitapNumarasi()==silinecekKitapNo) {
                kitapListesi.remove(k);
                System.out.println("Kitap başarıyla silindi");
            } else{
                System.out.println("Belirtilen numarada bir kitap bulunamadı");}

        }
        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...




    }
//////////////////////////////////////////////////
    public void kitapListele() {
        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.
        if (kitapListesi.isEmpty()){
            System.out.println("Henüz kitap eklenmemiş");}
        else {
            System.out.println("Kitaplistesi");
        for (Kitap k:kitapListesi)
            System.out.println(k);}


    }
}
