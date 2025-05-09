package OOP.Practice;

public class CarRanner {
    public static void main(String[] args) {
        Car car = new Car("nisan");
        car.invastigateSpeed100();

        Car supercar = new Car("supernisan",650);
        supercar.invastigateSpeed100();

        Garage garage = new Garage();
        garage.setCar1(car);
        garage.setCar2(supercar);
        garage.getInfoBontCars();
    }
}
