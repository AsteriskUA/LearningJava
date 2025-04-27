package Nachalo.masive;

public class multiarray {
    public static void main(String[] args) {
        int[] group1 = {180, 175, 190};
        int[] group2 = {178, 195, 193};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int numder : array) {
                if (numder == 178) {
                    System.out.println("Нашли вора!");
                    break upperFor;
                } else {
                    System.out.println("Вор не найдєн");
                }
            }
        }
    }
}
