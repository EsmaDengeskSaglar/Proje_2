package Shape_Project_2;

public class Daire implements IIslem {

    // TODO Bu class doldurunuz

    double yariCap;


    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {
        return this.yariCap*this.yariCap*Math.PI;
    }

    @Override
    public double cevreHesapla() {
        return 2*this.yariCap*Math.PI;
    }
}
