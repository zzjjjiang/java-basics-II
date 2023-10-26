public abstract class Vehicle {
    private int wheels = 4;
    private int weight = 2000;
    private int windows = 4;

    public Vehicle(){}
    public Vehicle(int wheels, int weight, int windows) {
        this.wheels = wheels;
        this.weight = weight;
        this.windows = windows;
    }
}
