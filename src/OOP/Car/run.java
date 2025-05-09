package OOP.Car;

import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("Bmw");
        System.out.println("Кількість машин: " + Car.getCountCar());
        Car.printBrands();
        System.out.println(Arrays.toString(Car.BrandInfo));




    }
}
