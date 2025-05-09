package OOP.Zoo;

import java.util.Arrays;

public class Dog {
    private String name = "Arista";
    private int weigth = 13;
    private String owner = "Vova";

    {
        System.out.println("New dog");
    }
    public Dog(){

    }

    public Dog(String name, int weigth, String owner) {
        if (weigth < 1){
            this.weigth = 14;
        } else {
            this.weigth = weigth;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeigth(int newWeigth){
        if (newWeigth < 1){
            this.weigth = 18;
        } else {
            this.weigth = newWeigth;
        }
    }

    public String getOwner(){
        return "Dmytro";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void feed(String giver , String ...product){ //varArgs ...nameАргумент (може бути лише в кінці) типу мето, з переліком даних, або без нього
        System.out.printf("%s gave a dog to eat %s\n", giver, Arrays.toString(product));
    }
}
