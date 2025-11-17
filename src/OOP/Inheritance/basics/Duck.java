package OOP.Inheritance.basics;

public class Duck implements flyable, swimable{
    @Override
    public void fly() {
        System.out.println("Качка летить");
    }

    @Override
    public void swim() {
        System.out.println("Качка плаває");
    }
}
