package Nachalo.String;

import java.util.Arrays;

public class StringMetod {
    public static void main(String[] args) {
        String text = "Hello World";

        //Перенесення у CapsLolk
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод у малі літери
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Щотчик довжини лінії(строки)
        int length = text.length();
        System.out.println(length);

        //Пошук слова(симол, текст) у тексті
        String replacedtext = text.replaceAll("l", "a");
        System.out.println(replacedtext);

        //Повторення текту n раз
        String repeattext = text.repeat(5);
        System.out.println(repeattext);

        //Розподіл тексту на масив Nachalo.String
        String names = "wow;non;tot;pep";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Поєднання ліній(строк)/Конкатинація
        String world1 = "h1 + ";
        String world2 = "h2";
        String result = world1 + world2;
        System.out.println(result);

        //Перевірка на початок тексту з n символу(слова)
        boolean startsWith = text.startsWith("Hel");
        System.out.println(startsWith);

        //Перевірка тексту на закінчення тексту з n символу(слова)
        boolean endsWith = text.endsWith("old");
        System.out.println(endsWith);

        //Укорочення тексту
        String substring = text.substring(0, 5);
        System.out.println(substring);

        System.out.println("_________________________");

        //Приклад многово використання
        String lengthText2 = "hello".replaceAll("l", "!").toUpperCase();
        System.out.println(lengthText2);
    }
}
