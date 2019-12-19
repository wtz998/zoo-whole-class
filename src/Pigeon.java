/**
 * Creates a Pigeon (Avian-class) creature
 */
public class Pigeon extends Avian {

    /**
     * Parameters for an avian creature
     *
     * @param age        Age of creature
     * @param color      Color of creature
     * @param weight     Weight of creature
     * @param endangered If creature is endangered
     * @param sleeping   If creature is sleeping
     * @param speed      Movement speed of creature
     * @param canFly     If the creature can fly
     */
    public Pigeon(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, boolean canFly) {
        super(age, color, weight, endangered, sleeping, speed, canFly);
    }

    /**
     * Returns information about Pigeon
     * @return information about Pigeon
     */
    @Override
    public String toString() {
        return "ZooResident{" +
                "age=" + super.getAge() +
                ", color='" + super.getColor() + '\'' +
                ", weight=" + super.getWeight() +
                ", endangered=" + super.isEndangered() +
                ", sleeping=" + super.isSleeping() +
                ", speed=" + super.getSpeed() +
                ", canFly=" + super.isCanFly() +
                '}';
    }

    /**
     * Entry point for Pigeon
     * @param args
     */
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon(10, "RED", 2, false, true, 20, true);
    }
}

