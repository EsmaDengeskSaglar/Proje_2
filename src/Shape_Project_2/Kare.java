package Shape_Project_2;

public class Kare implements IIslem {
    // TODO Bu class doldurunuz

    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return this.kenar*this.kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4*this.kenar;
    }





}
