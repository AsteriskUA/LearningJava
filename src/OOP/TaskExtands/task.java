package OOP.TaskExtands;

public class task {
    public static void main(String[] args) {

        defender defender = new defender(true);
        secretary secretary = new secretary(false);
        financeManeger financeManeger = new financeManeger(false);


        defender.getSalery();
        secretary.getSalery();
        financeManeger.getSalery();
        financeManeger.drinkCoffee();


    }
}
