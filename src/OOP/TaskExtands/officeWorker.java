package OOP.TaskExtands;

public abstract class officeWorker extends human {

    public officeWorker(boolean isMan){
        super(isMan);
    }
    public void drinkCoffee(){
        System.out.println("Работяга попиває кофе");
    }

}
