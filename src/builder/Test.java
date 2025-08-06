package builder;

public class Test {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Ivan")
                .surname("Sergeev")
                .age(25)
                .isEmployed(true)
                .build();
        System.out.println(person);
    }
}
