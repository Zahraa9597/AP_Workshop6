public class Giraffe extends Mammal implements Prey{
    public Giraffe(String name, int age, String uniqueCharacteristic, int Speed ) {
        super(name, age, uniqueCharacteristic, Speed);
    }
    @Override
    public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Speed: " + getSpeed() + ", Special Feature: " + getUniqueCharacteristic());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
