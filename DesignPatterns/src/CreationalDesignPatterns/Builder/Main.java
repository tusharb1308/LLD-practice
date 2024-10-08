package CreationalDesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.getBuilder()
                .setFirstName("Tushar")
                .setLastName("Bansal")
                .setAge(24)
                .setPhnNumber("9914550644")
                .build();

        person1.toString();

        Person person2 = Person.getBuilder()
                .setFirstName("Umang")
                .setLastName("Bansal")
                .build();

        person2.toString();
    }
}
