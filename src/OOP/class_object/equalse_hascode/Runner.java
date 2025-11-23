package OOP.class_object.equalse_hascode;

import OOP.class_object.HashCode.Child;
import OOP.class_object.HashCode.ChildrenGarden;

public class Runner {
    public static void main(String[] args) {
//        Cat cat = new Cat("Шерстяний");
//
//        Class<? extends Cat> catClass = cat.getClass();
//        System.out.println(catClass.getName());
//        System.out.println(cat.toString());


        Child child1 = new Child("Pavlo", 2045);
        Child child2 = new Child("Go-Go", 2046);
        Child child3 = new Child("Amber", 2044);
        Child child4 = new Child("Loki", 2043);
        Child child5 = new Child("Emma", 2042);

        Child[] children = {child1, child2, child3, child4, child5};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;

//        for (Child child : childrenGarden.getChildren()) {
//            if (child.getName().equals("Go-Go") && child.getYear() == 2046){
//            result = true;
//            break;
//            }
//        }

        Child childForFind = new Child("Emma", 2042);

        for (Child child : childrenGarden.getChildren()) {
            if (child.equals(childForFind))
            result = true;
            break;
        }

        System.out.println(result);
    }
}
