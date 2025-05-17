package OOP.Inheritance.Dogs;

public final class Poodle extends Dog{

    public Poodle() {
        super(30);
    }

    public void DogRun(){
        System.out.println("Пудель біжить повільно");
    }

    @Override
    public void breath() {
        System.out.println("Пудель дихає");
    }
}
