package ONPK.interface_inheritance.interfase_inheritace;

public interface Eatable {
    default void  eat(){
        System.out.println("об'єкт їсть");

    };

}
