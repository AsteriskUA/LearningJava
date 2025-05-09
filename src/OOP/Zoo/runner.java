package OOP.Zoo;

public class runner {
    public static void main(String[] args) {
        Cat cat = new Cat("white",12,"Afonov");
//        System.out.println(cat.color);
//
//        cat.destroySofa("Крокодило Бомбарило");
//
//        String animal = cat.hunt(false);
//        System.out.println(animal);
//
//        String resulthunt2 = cat.hunt(true,false);
//        cat.hunt("Nigth");
//        System.out.println(resulthunt2);
//
//        cat.feed("fish","woter","eggs");


        Dog dog = new Dog("Jesse", -12, "Victoria");
//        System.out.println(dog);
//        dog.setWeigth(-23);
//        System.out.println(dog);
//        System.out.println(dog.getOwner());

//        Dog dog2 = new Dog();
//        System.out.println(dog2);

        Zoo zoo = new Zoo(dog, cat);
        zoo.feed();


    }
}
