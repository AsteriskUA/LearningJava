package OOP.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Poodle extends Dog{

    public void DogRun(){
        System.out.println("Собака біжить повільно");
    }

    @Override
    public void breath() {
        System.out.println("Собака дихає");
    }
}
