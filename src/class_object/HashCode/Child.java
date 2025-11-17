package class_object.HashCode;

public class Child {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Child(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return this.getYear() % 2;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.printf(" Виконується порівняння з " + this.getName());
        if (obj == null){
            return false;
        }
        if (obj instanceof  Child child2){
                return this.getName().equals(child2.getName()) && this.getYear() == child2.getYear();
//            Child child2 = (Child) obj;
        }
        return false;


    }
}
