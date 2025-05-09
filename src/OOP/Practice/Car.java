package OOP.Practice;

public class Car {
    private String brand;

    private int maxspeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxspeed) {
        this.brand = brand;
        this.maxspeed = maxspeed;
    }

    public void invastigateSpeed100() {
    double speed = 110d / (this.maxspeed / 20d);
        System.out.printf("Швидкість машини до 100км/годину = %s\n",speed);
    }

    public String getBrand() {
        return brand;
    }
}
