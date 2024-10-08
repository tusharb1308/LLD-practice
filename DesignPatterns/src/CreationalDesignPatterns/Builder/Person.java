package CreationalDesignPatterns.Builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String phnNumber;
    // other attributes and methods

    @Override
    public String toString() {
        System.out.println( "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phnNumber='" + phnNumber + '\'' +
                '}');
        return null;
    }

    Person(PersonBuilder personBuilder){
        firstName = personBuilder.firstName;
        lastName = personBuilder.lastName;
        age = personBuilder.age;
        phnNumber = personBuilder.phnNumber;
    }

    public static PersonBuilder getBuilder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String firstName = "";
        private String lastName = "";
        private int age = 0;
        private String phnNumber = "";

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setPhnNumber(String phnNumber) {
            this.phnNumber = phnNumber;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

}
