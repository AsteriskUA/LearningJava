package OOP.interface_inheritance.functional_interface;

@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void toSomething(){
        System.out.println("Щось то рибить");
    }
}
