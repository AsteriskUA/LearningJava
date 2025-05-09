package OOP.Restaurant;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog(){
        if (sausageCount > 0 && breadCount > 1){
            sausageCount --;
            breadCount -= 2;
            System.out.println("Хотдог готовий");
        } else {
            System.out.println("Ресурсу недостатньо, хот дог неможливо приготувати");
        }
    }

    public void addProducts(){
        sausageCount += 100;
        breadCount += 100;
    }




}
