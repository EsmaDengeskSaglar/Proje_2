package SuperHero_Project;

public class WonderWoman extends SuperHeroes{
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...

private String golden_lasso;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String golden_lasso) {
        super(name, gender, aggression, wisdom, beauty);
        setGolden_lass(golden_lasso);
    }

    public String getGolden_lass() {
        return golden_lasso;
    }

    public void setGolden_lass(String golden_lass) {
        this.golden_lasso = golden_lass;
    }

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty) {
        super(name, gender, aggression, wisdom, beauty);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(getName()+ ", Golden Lasso-guclu Truth Lasso ile saldirabilir ve dusmanlarini dogrulugu soylemeye zorlayabilir.");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica, "+getName()+"Golden Lasso-guclu Truth Lasso ile saldirabilir ve dusmanlarini dogrulugu soylemeye zorlayabilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+ ", Golden Lasso-guclu Truth Lasso ile saldirabilir ve dusmanlarini dogrulugu soylemeye zorlayabilir.");
    }
}
