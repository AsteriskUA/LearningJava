package OOP.Inheritance;

public abstract class Dog extends Alive{
    public int countLegs = 4;
    public int countTeeth;

    public void PoodleLegs(){
        System.out.printf("Пудель має %d лап", countLegs);
    }

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void Bark(){
        System.out.println("Собака гавкає");
    }

    public abstract void DogRun();

}
