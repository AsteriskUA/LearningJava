package OOP.Inheritance.Dogs;

public class Korgi extends Dog{
    public Korgi() {
        super(34);
    }
    
    public void KorgiTeeth() {
        System.out.printf("Коргі має %d зубів", countTeeth);
    }

    @Override
    public void DogRun() {
        System.out.println("Коргі бігає не дуже швидко");
    }

    @Override
    public void breath() {
        System.out.println("Коргі дихає");
    }

    public void byAngry(){
        System.out.println("Коргі побачила підозрілу людину");
        super.ByAngry();
        System.out.println("Людина злякалась та пішла іншою дорогою");
    }



}
