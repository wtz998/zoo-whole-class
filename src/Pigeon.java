public class Pigeon extends Avian {
    /**
     * builds a zoo resident
     *
     * @param age        the age of the resident
     * @param color      the color of the resident
     * @param weight     the weight of the resident
     * @param endangered is the resident endangered
     * @param sleeping   is the resident sleeping
     * @param speed
     * @param legs
     * @param canFly
     */
    public Pigeon(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, double legs, boolean canFly) {
        super(5, "grey", 2, false, true, 35, 2, true);
    }
}

