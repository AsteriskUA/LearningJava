package ONPK.interface_inheritance.functional_interface;

public class Runer {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("чірік чірік");
        bird.makeSound();
    }
}
