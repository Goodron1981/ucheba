public class Car {

    private double velocity;
    private double weight;
    //расход топлива
    private double fuel;

    /**
     * Constructor.
     * @param weight weight
     * @param fuel расход топлива
     */
    public Car(double weight, double fuel) {
        this.weight = weight;
        this.fuel = fuel;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
