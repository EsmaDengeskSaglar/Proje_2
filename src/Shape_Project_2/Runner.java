package Shape_Project_2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO Bu class doldurunuz
        Scanner oku = new Scanner(System.in);

        System.out.println("Karenin kenar uzunlugunu girin:");
        int kenar= oku.nextInt();
        Kare k=new Kare(kenar);
        System.out.println("Karenin cevresi:"+k.cevreHesapla());
        System.out.println("Karenin alanı:" + k.alanHesapla());

        System.out.println("****************************");

        System.out.println("Dikdörtgenin kısa kenarini giriniz:");
        int kisaKenar= oku.nextInt();
        System.out.println("Dikdörtgenin uzun kenarini giriniz:");
        int uzunKenar= oku.nextInt();
        Dikdortgen dd=new Dikdortgen(kisaKenar,uzunKenar);
        System.out.println("Dikdörtgenin cevresi:" +dd.cevreHesapla());
        System.out.println("Dikdörtgenin alanı:" + dd.alanHesapla());

        System.out.println("****************************");


        System.out.println("Daire nin yarı Çapını girin:");
        double yariCap= oku.nextDouble();
        Daire d=new Daire(yariCap);
        System.out.println("Dairenin cevresi:"+ d.cevreHesapla());
        System.out.println("Dairenin alanı:" +d.alanHesapla());

        System.out.println("****************************");


        System.out.println("Ücegenin 1. kenarini girin:");
        int kenar1= oku.nextInt();
        System.out.println("Ücegenin 2. kenarini girin:");
        int kenar2= oku.nextInt();
        System.out.println("Ücegenin 3. kenarini girin:");
        int kenar3= oku.nextInt();
        Ucgen u=new Ucgen(kenar1,kenar2,kenar3);
        System.out.println("Ücgenin cevresi:" + u.cevreHesapla());
        System.out.println("Ücgenin alanı:" + u.alanHesapla());





















    }
}
