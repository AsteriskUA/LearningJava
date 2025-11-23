package OOP.excaption;

public class Car {
    private boolean IsBroken;

    public Car(boolean isBroken) {
        IsBroken = isBroken;
    }

    public void start () throws CarIsBrokenException {
        if (IsBroken){
           // throw new CarIsBrokenException("машина змалмана");
        }
        System.out.println("Машина праюцє");
    }
}
