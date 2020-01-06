/**
 * residents who live in a zoo
 */
public abstract class ZooResident {
    private int age;
    private String color;
    private double weight;
    private boolean endangered;
    private boolean sleeping;

    /**
     * builds a zoo resident
     * @param age the age of the resident
     * @param color the color of the resident
     * @param weight the weight of the resident
     * @param endangered is the resident endangered
     * @param sleeping is the resident sleeping
     */
    public ZooResident(int age, String color, double weight, boolean endangered, boolean sleeping) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.endangered = endangered;
        this.sleeping = sleeping;
    }

     /**
     * Animal is eating
     * @return
     */
    public abstract String eat();

    /**
     * How the animal moves
     * @return
     */
    public abstract String move();

    /**
     * The animal doing something
     * @return
     */
    public abstract String doSomething();
    
    /**
     * returns the age of the resident
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * returns the color of the resident
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * returns the weight of the resident
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * is the resident endangered
     * @return true if endangered
     */
    public boolean isEndangered() {
        return endangered;
    }

    /**
     * is the resident sleeping
     * @return true if resident is sleeping
     */
    public boolean isSleeping() {
        return sleeping;
    }

    /**
     * puts the resident to sleep
     * @return the status of sleeping
     */
    public String sleep() {
        return sleeping
                ? "I'm already asleep"
                : "zzzzzzzzzzzzzzzzz";
    }

    /**
     * wakes the resident up
     * @return the wake status
     */
    public String wakeUp(){
        return sleeping
                ? "I'm awake!"
                : "I wasn't sleeping";
    }

    @Override
    public String toString() {
        return "ZooResident{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", endangered=" + endangered +
                ", sleeping=" + sleeping +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooResident that = (ZooResident) o;
        return age == that.age &&
                Double.compare(that.weight, weight) == 0 &&
                endangered == that.endangered &&
                sleeping == that.sleeping &&
                color.equals(that.color);
    }

}
