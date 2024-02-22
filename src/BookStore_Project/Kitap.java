package BookStore_Project;

class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.

private int kitapNumarasi;
private int yayinYili;
private String kitapAdi;
private String yazarAd;
private double fiyat;

private static int id=1;

    ///////////////////////////////////////////////////////////////////////
    public Kitap(String kitapAdi, String yazarAd, int yayinYili, double fiyat) {
        //TODO: Kitap nesnesi oluşturma sırasında ilk çalışan metodu (constructor) olusturun
        //NOT: Her kitabın tekil bir kitap numarası (id) olduğunu unutmayınız...

        setKitapAdi(kitapAdi);
        setYazarAd(yazarAd);
        setYayinYili(yayinYili);
        setFiyat(fiyat);
        this.kitapNumarasi=id++;

    }
    // TODO: Gerekli olan getter() veya setter() metodlarını oluşturunuz.
    // Kullanılmayanları oluşturmanıza gerek yok.
    // Program tamamlandıktan sonra kullanılmayan metodları sonradan silmek de bir yöntemdir


    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    public void setKitapNumarasi(int kitapNumarasi) {
        this.kitapNumarasi = kitapNumarasi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAd() {
        return yazarAd;
    }

    public void setYazarAd(String yazarAd) {
        this.yazarAd = yazarAd;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }



    //TODO: Kitabın özelliklerini yazdıracak toString() metodunu tamamlayınız...(Return icini doldurun)
    @Override
    public String toString() {
        return
                "KitapNumarasi=" + kitapNumarasi +
                ", YayinYili=" + yayinYili +
                ", KitapAdi='" + kitapAdi + '\'' +
                ", YazarAdi='" + yazarAd + '\'' +
                ", Fiyat=" + fiyat + "Tl";
    }

}
