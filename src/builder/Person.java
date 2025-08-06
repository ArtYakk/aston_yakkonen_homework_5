package builder;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final boolean isEmployed;

    private Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.isEmployed = builder.isEmployed;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public static class Builder{
        private String name;
        private String surname;
        private int age;
        private boolean isEmployed;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder isEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
