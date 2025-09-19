package ONPK.interface_inheritance.interfase_inheritace;

public interface Moveble {
    void move();

    default void eat(){
        System.out.println("Об'єкт їсть біжучи");
    };
}
