public class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void incrementAge(int delta) {
        this.age = this.age + delta;
    }

    @Override
    public String toString() {
        return "age:" + age +
                ", name:" + name + '\'';
    }
}
