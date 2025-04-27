package Nachalo.masive;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
//        створення масива, задання його місткості та встановлення чисел
        /*int[] array = new int[5];
        array[2] = x;
        array[4] = y;*/

//        укоросена форма запису коли не потрібно указувати точки для значень
//        int [] array = new int[]{x, y};

//        ще більш укоросена форма
//        int [] array = {x, y};
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[0]);

        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = 13;
        array2[1] = 5;
        System.out.println(Arrays.toString(array));


        char[] answer ={'f','f','g','6'};
        System.out.println(Arrays.toString(answer));
    }
}