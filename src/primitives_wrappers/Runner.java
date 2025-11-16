package primitives_wrappers;

public class Runner {
    public static void main(String[] args) {
        String text = "1000";
        int number = Integer.parseInt(text);
        System.out.println(number * 4);
        Integer numberWrapper = null;
        System.out.println(numberWrapper * 2);

    }
}
