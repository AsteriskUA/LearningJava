package None;

public class Continue {
    public static void main(Continue[] args) {
        int[] results = {3, 5, 6, 2, 1};
        for (int result : results){
            System.out.println(result);
            if(result == 6){
                continue;
            }
            System.out.println("working-working");
        }
    }
}
