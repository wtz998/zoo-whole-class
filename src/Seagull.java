
public class Seagull extends Avian {

    /**
     * builds a zoo resident
     *
     * @param age        the age of the resident
     * @param color      the color of the resident
     * @param weight     the weight of the resident
     * @param endangered is the resident endangered
     * @param sleeping   is the resident sleeping
     */
    public Seagull(int age, String color, double weight, boolean endangered, boolean sleeping, double speed, double legs, boolean canFly, boolean inFlight) {
        super(10, "white and grey", 5, false, false, 40, true, true);
    }
}
    /**
     * Animal is eating
     * @return
     */
    public String eat(){
        return "Your Food"
    }
    /**
     * How the animal moves
     * @return
     */
    public String move(){
        return "Fly"
    }

    /**
     * The animal doing something
     * @return
     */
    public String doSomething(){
        return "arial assault"
    }


}
