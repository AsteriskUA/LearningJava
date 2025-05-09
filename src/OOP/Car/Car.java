package OOP.Car;

public class Car {
    private String brend;
    private static int countCar = 0;

    public final static String KiaInfo = "Kia - ето дешевий КінЧенНин, краще не купляти)\n";
    public final static String BmwInfo = "Bmw - Тачка для понтов і крутих дядь\n";
    public final static String AudiInfo = "Audi - це краще що можна побачити на Німецькому ринку\n";

    public final static String[] BrandInfo = new String[3];
    static {
        BrandInfo[0] = KiaInfo;
        BrandInfo[1] = BmwInfo;
        BrandInfo[2] = AudiInfo;
    }
    public Car(String brend) {
        this.brend = brend;
        countCar++;
    }

    public static int getCountCar() {
        return countCar;
    }

    public static void printBrands(){
        System.out.println("Всі доступні бренди машин: Audi, Bmw, Kia");
    }


}



