package HashCode;

import class_object.Child;

public class RunnerHashCode {
    public static void main(String[] args) {
        Child child1 = new Child("Pavlo", 2045);
        Child child2 = new Child("Go-Go", 2046);
        Child child3 = new Child("Amber", 2044);
        Child child4 = new Child("Loki", 2043);
        Child child5 = new Child("Emma", 2042);

        Child[] group0 = {child1, child4};
        Child[] group1 = {child2, child3, child5};
        Child[][] children = {group0, group1};

        Child childForFind = new Child("Amber", 2044);

        ChildrenGardenWithGroup childrenGardenWithGroup = new ChildrenGardenWithGroup(children);

        boolean result = true;

        for (Child child : childrenGardenWithGroup.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)){
                result = false;
                break;
            }
        }
        System.out.println("\n" + result);

    }
}
