package OOP.Inheritance;

import OOP.Inheritance.Dogs.Korgi;
import OOP.Inheritance.Dogs.Poodle;

public class InheritanceRunner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.Bark();
        poodle.DogRun();
        poodle.breath();
        poodle.PoodleLegs();

        System.out.println("\n----------------------------------");

        Korgi korgi = new Korgi();
        korgi.Bark();
        korgi.DogRun();
        korgi.breath();
        korgi.byAngry();
        korgi.KorgiTeeth();



    }
}
