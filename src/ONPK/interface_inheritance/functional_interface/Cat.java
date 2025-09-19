package ONPK.interface_inheritance.functional_interface;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Мяу Мяууу");
    }
}
