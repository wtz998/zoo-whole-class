public class Amphibians extends ZooResident {
    private int legs;
    private int toes;

    public Amphibians(int age, String color, double weight, boolean endangered, boolean sleeping, int legs, int toes) {
        super(age, color, weight, endangered, sleeping);
        this.legs = legs;
        this.toes = toes;
    }

    public int getLegs() {
        return legs;
    }

    public int getToes() {
        return toes;
    }

    @Override
    public String sleep() {
        return super.isSleeping()
                ? "I'm asleep"
                : "Starting to go to sleep....";
    }

    @Override
    public String wakeUp(){
        return super.isSleeping()
                ? "awww its a good day to be alive"
                : "I'm not tired man";
    }

    @Override
    public String toString() {
        return "ZooResident{" +
                "age=" + super.getAge() +
                ", color='" + super.getColor() + '\'' +
                ", weight=" + super.getWeight() +
                ", endangered=" + super.isEndangered() +
                ", sleeping=" + super.isSleeping() +
                ", legs=" + getLegs() +
                ", toes=" + getToes() +
                '}';
    }
}
