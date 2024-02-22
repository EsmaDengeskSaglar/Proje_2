package SuperHero_Project;

public class Superman extends SuperHeroes {
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...


    private String supersonic_flight;
    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String supersonic_flight) {
        super(name, gender, aggression, wisdom, beauty);
        setSupersonic_flight(supersonic_flight);
    }

    public String getSupersonic_flight() {
        return supersonic_flight;
    }

    public void setSupersonic_flight(String supersonic_flight) {
        this.supersonic_flight = supersonic_flight;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println(getName()+ ", ucarken Supersonic Flight-guclu saldirilar gerceklestirebilir.");


    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca "+getName()+",ucarken Supersonic Flight-guclu saldirilar gerceklestirebilir.");

    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+ ", ucarken Supersonic Flight-guclu saldirilar gerceklestirebilir.");
    }
}
