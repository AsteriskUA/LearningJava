package class_object.equals_hascode_practise;

public class Runner {
    public static void main(String[] args) {
        User user1 = new User("Zero", "1234");
        User user2 = new User("Zero", "4321");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

    }
}

