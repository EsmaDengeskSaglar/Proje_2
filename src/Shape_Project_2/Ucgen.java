package Shape_Project_2;

public class Ucgen implements IIslem {
    // TODO Bu class doldurunuz

    int kenar1;
    int kenar2;
    int kenar3;

    public Ucgen(int kenar1, int kenar2, int kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    public double alanHesapla() {
        double s= (this.kenar1+this.kenar2+this.kenar3)/2;
        return Math.sqrt(s*(s-this.kenar1)*(s-this.kenar2)*(s-this.kenar3));
    }

    @Override
    public double cevreHesapla() {
        return this.kenar1+this.kenar2+this.kenar3;
    }



}
