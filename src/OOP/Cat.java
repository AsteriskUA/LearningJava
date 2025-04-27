package OOP;

public class Cat {
    String color;
    double weight;
    String ownerName;


    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кошак унічтожає диван %s\n", sofaOwner);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";
        } return "Own";
    }

    public String hunt(boolean isDay, boolean success){
        if(success){
            if (isDay) {
                return "Mouse";
            } return "Own";
        }
        return "Nothing";
    }

    public void hunt(String timeOfDay){
        if (timeOfDay.equals("Day")){
            System.out.println("Mouse");
        } else {
            System.out.println("Mosquito");
        }
    }










}

