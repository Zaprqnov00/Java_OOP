package T3_Inheritance.Exercices.Animals_06;

public class Kitten extends Cat{
    private final static String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
