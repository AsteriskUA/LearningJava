package OOP.excaption;

public class FinallyExcample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e){
            System.out.println("Уви маємо попилку");
        } finally {
            System.out.println("Програма працює до кінця");
        }
    }
}
