package SuperHero_Project;

public class Wolverine extends SuperHeroes {

    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...

    private String adamantium_claws;
    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantium_claws) {
        super(name, gender, aggression, wisdom, beauty);
        setAdamantium_claws(adamantium_claws);
    }


    public String getAdamantium_claws() {
        return adamantium_claws;
    }

    public void setAdamantium_claws(String adamantium_claws) {
        this.adamantium_claws = adamantium_claws;
    }

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty) {
        super(name, gender, aggression, wisdom, beauty);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(getName()+ ", adamantium penceleri ile saldirabilir ve dusmanlarini hizla etkisiz hale getirebilir.");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica,"+getName() +"adamantium penceleri ile saldirabilir ve dusmanlarini hizla etkisiz hale getirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+ ",  adamantium penceleri ile saldirabilir ve dusmanlarini hizla etkisiz hale getirebilir.");
    }
}

