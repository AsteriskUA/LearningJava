package OOP;

public class runner {
    public static void main(String[] args) {
        Cat cat = new Cat("white",12,"Afonov");
        System.out.println(cat.color);

        cat.destroySofa("Крокодило Бомбарило");

        String animal = cat.hunt(false);
        System.out.println(animal);

        String resulthunt2 = cat.hunt(true,false);
        cat.hunt("Nigth");
        System.out.println(resulthunt2);
    }
}
