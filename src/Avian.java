/**
 * The bird people
 */
public abstract class Avian extends ZooResident{
    private double speed;
    private double legs = 2;
    private boolean canFly;

    /**
     * Parameters for an avian creature
     *
     * @param age           Age of creature
     * @param color         Color of creature
     * @param weight        Weight of creature
     * @param endangered    If creature is endangered
     * @param sleeping      If creature is sleeping
     * @param speed         Movement speed of creature
     * @param canFly        If the creature can fly
     */
    public Avian(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, boolean canFly) {
        super(age, color, weight, endangered, sleeping);
    }

    /**
     * Returns speed of the resident
     * @return The speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets speed of creature
     * @param speed The speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Returns if the creature can fly
     * @return If the creature can fly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * Sets if the creature can fly
     * @param canFly If the creature can fly
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
