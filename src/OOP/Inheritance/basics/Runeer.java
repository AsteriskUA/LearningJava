package OOP.Inheritance.basics;

public class Runeer {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        Moveble[] movebles = new Moveble[2];
//        movebles[0] = cat;
//        movebles[1] = dog;
//        for(Moveble moveble: movebles){
//            moveble.move();
//        }

        Fish fish = new Fish();
        AirPlane airPlane = new AirPlane();
        Duck duck = new Duck();

        swimable[] swimpool = {fish, duck};
        flyable[] sky = {duck, airPlane};

        System.out.println("-----------------");
        System.out.println("В озері");
        for (swimable swimable : swimpool) {
            swimable.swim();
        }
        System.out.println("-----------------");
        System.out.println("В небі");
        for (flyable flyable : sky) {
            flyable.fly();
        }
        System.out.println("-----------------");

    }
}
