package Anonymuos_classes;

public class run {
    public static void main(String[] args) {
//        Alive dog = new Dog();
//        dog.breath();
//        dog.eat();

        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("dog eat");
            }

            @Override
            public void breath() {
                System.out.println("dog breath");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Cat eat");
            }
        };

        cat.eat();
        System.out.println(cat.contLags);

    }
}
