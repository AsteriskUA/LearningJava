package OOP;

public class Dog {
    String name;
    int weigth;
    String owner;

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
}
