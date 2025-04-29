package OOP;

import java.util.Arrays;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void feed(){
        cat.feed("Torn","fish");
        dog.feed("Rouse","bone");
    }

}
