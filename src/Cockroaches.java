public class Cockroaches extends CreepyCrawlies {
    public boolean hasTwoPairWings;
    public boolean isScary;




    public Cockroaches(int age, String color, double weight, boolean endangered, boolean sleeping) {
        super(age, color, weight, endangered, sleeping, true, true);
    }

    public boolean isHasTwoPairWings() {
        return hasTwoPairWings;
    }

    public void setHasTwoPairWings(boolean hasTwoPairWings) {
        this.hasTwoPairWings = hasTwoPairWings;
    }

    public boolean isScary() {
        return isScary;
    }

    public void setScary(boolean scary) {
        isScary = scary;
    }
}
