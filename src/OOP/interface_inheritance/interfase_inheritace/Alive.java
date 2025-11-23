package OOP.interface_inheritance.interfase_inheritace;

public interface Alive extends Eatable, Moveble {
    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
