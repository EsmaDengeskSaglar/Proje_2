package SuperHero_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.

        allHeroes.add("Batman");
        allHeroes.add("Superman");
        allHeroes.add("Wonder Woman");
        allHeroes.add("Spiderman");
        allHeroes.add("Wolverine");

        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun

        System.out.println("Süper Kahramanlar gösterisine hoş geldiniz...");
        System.out.println("Mevcut Süper Kahramanlar: " + allHeroes);
        System.out.println("Çıkmak için q'ya basın...");
        String secim;

        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin
        while (true) {
            Scanner oku = new Scanner(System.in);
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz? ");
            secim = oku.nextLine();

            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor");
                break;
            }
            if (allHeroes.contains(secim) && !activeHeroes.contains(secim)) {
                activeHeroes.add(secim);
                System.out.println(secim + " oyuna başarıyla eklendi.");
            } else if (activeHeroes.contains(secim)) {
                System.out.println(secim + " zaten oyunda aktif!");
            } else if (!allHeroes.contains(secim) && !activeHeroes.contains(secim)) {
                System.out.println("Lütfen geçerli bir süper kahraman girin");
            }

            HeroFactory factory=new HeroFactory();
            SuperHeroes superHeroe=factory.produceSuperHero(secim);


            if (superHeroe!=null){
                superHeroe.attack();
                superHeroe.printInfo();
                superHeroe.exposeSecretPower();

                activeHeroes.add(secim);
                System.out.println(secim+" kahraman oyuna girdi");
                System.out.println("Activ kahramanlar:" + activeHeroes);
                System.out.println("Activ olmayan Kahramanlar:" + getRemainingHeroes(allHeroes,activeHeroes));
            }




        }
        //TODO: Eğer girilen isim allHeros listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
        // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

        //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

        //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

        //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...

    }

    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
