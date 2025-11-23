package OOP.excaption;

public class CheckedExcaptionExample {
    public static void main(String[] args) {
        try {
            startCar(0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void startCar(int fuel) throws Exception{
        checkFuel(fuel);
        System.out.println("машина їде");
    }
    public static void checkFuel(int fuel) throws Exception{
        if (fuel <= 0){
            throw new RuntimeException ("Топлива немає, потрібно заправити!");
        }
    }
}
