package OOP.TaskExtands;

public class secretary extends officeWorker{

    public secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalery() {
        System.out.println("Секретарь отримує по 30к");
    }
}
