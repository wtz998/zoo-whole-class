public class Bees extends CreepyCrawlies {
    public boolean completeMetamorphosis;
    public boolean compoundEyes;

    public boolean isCompleteMetamorphosis() {
        return completeMetamorphosis;
    }

    public void setCompleteMetamorphosis(boolean completeMetamorphosis) {
        this.completeMetamorphosis = completeMetamorphosis;
    }

    public boolean isCompoundEyes() {
        return compoundEyes;
    }

    public void setCompoundEyes(boolean compoundEyes) {
        this.compoundEyes = compoundEyes;
    }

    public Bees(int age, String color, double weight, boolean endangered, boolean sleeping) {
        super(age, "Yellow", weight, endangered, sleeping, true, true);
    }
}
