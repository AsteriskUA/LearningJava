package OOP.Practice;

public class Garage {

    private Car car1;
    private Car car2;

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getInfoBontCars(){
        getInfoAboutCars(car1);
        getInfoAboutCars(car2);
    }

    private void getInfoAboutCars(Car car){
        System.out.println(car.getBrand());
        car.invastigateSpeed100();
    }
}
