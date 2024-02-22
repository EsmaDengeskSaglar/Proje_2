package Shape_Project_2;

public class Dikdortgen implements IIslem{
    // TODO Bu class doldurunuz

    int kisaKenar;
    int uzunKenar;


    public Dikdortgen(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return 2*(this.kisaKenar+this.uzunKenar);
    }


}
