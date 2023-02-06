public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        User user = new User(25, "Bob");
        System.out.println(user);
        user.incrementAge(4);
        System.out.println(user);
    }
}