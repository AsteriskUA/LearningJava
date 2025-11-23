package OOP.class_object.equals_hascode_practise;

public class User {
    private String Login;
    private String Password;

    public User(String login, String password) {
        Login = login;
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (o instanceof User anotherUser){
            return this.Login.equals(anotherUser.Login) && this.Password.equals(anotherUser.Password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.Login.hashCode();
    }
}
