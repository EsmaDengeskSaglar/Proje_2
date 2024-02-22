package SuperHero_Project;

public class Batman extends SuperHeroes {
    // TODO SpiderMan'deki adımları bu class için de uygulayınız...

   private String detective_skills;
    public Batman(String name, String gender, String aggression, String wisdom, String beauty, String detective_skills) {
        super(name, gender, aggression, wisdom, beauty);
        setDetective_skills(detective_skills);
    }

    public String getDetective_skills() {
        return detective_skills;
    }

    public void setDetective_skills(String detective_skills) {
        this.detective_skills = detective_skills;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Dedektif yeteneklerine sahiptir"+detective_skills);

    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca,"+getName()+"dedektif becerileri ile saldırabilir ve düşmanlarını planlayarak alt edebilir ");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();

        System.out.println(getName()+",dedektif becerilerine sahiptir");

    }
}
