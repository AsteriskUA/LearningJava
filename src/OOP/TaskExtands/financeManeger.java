package OOP.TaskExtands;

public class financeManeger extends officeWorker{

    public financeManeger(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalery() {
        System.out.println("Бугалтер виплачує собі 50к зелених");
    }
}
