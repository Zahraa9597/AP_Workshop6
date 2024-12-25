public class Giraffe extends Mammal implements Prey{
    public Giraffe(String name, String age, String uniqueCharacteristic, int Speed ) {
        super(name, age, uniqueCharacteristic, Speed);
    }
    @Override public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Speed: " + getSpeed() + ", Special Feature: " + getUniqueCharacteristic());
    }
}
