package OOP.TaskExtands;

public class defender extends human{

    public defender(boolean isMan) {
        super(isMan);
}

    @Override
    public void getSalery() {
        System.out.println("Страж получає 15к");
    }
}
