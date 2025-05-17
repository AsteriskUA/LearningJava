package OOP.Inheritance.Dogs;

import OOP.Inheritance.Alive;

public abstract class Dog extends Alive {
    protected final int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "Canic famaliaris";

    public void PoodleLegs(){
        System.out.printf("Пудель має %d лапи", countLegs);
    }

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void ByAngry(){
        System.out.println("Собака ричить");
    }

    public final void eat(){
        System.out.println("Собака їсть");
    }

    public void Bark(){
        System.out.println("Собака гавкає");
    }

    public abstract void DogRun();

}
