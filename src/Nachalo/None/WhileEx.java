package Nachalo.None;

public class WhileEx {
    public static void main(WhileEx[] args) {
        int count = 1;
        while (count < 101){
//            System.out.println(count);
            count++;
        }

        while (true){
            count++;
            System.out.println(count);
            if(count == 1_000){
                break;
            }
        }
    }
}
