package Nachalo.String;

public class StringFormat {
    public static void main(String[] args) {
//        Nachalo.String name = "Popov";
//        int age = 24;
//        Nachalo.String format = Nachalo.String.format("Мене звати %s. Мені %d років.", name, age);
//        System.out.println(format);


        String carMark = "Audi" ;
        String carModel = "Q3";
        double prise = 15_000.00;
        boolean hasAutomaticTransmission = true;
        String formatted = """
                Привіт я менеджер салона %s.
                У нас є модель %s за %f.
                Чи є у неї автоматична коробка передач?
                %s
                """.formatted(carMark, carModel, prise, hasAutomaticTransmission ? "Так є" : "Ні немає");
        System.out.println(formatted);

    }
}

