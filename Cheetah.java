public class Cheetah extends Mammal implements Hunter{

    public Cheetah(String name, int age, String uniqueCharacteristic, int speed) {
        super(name, age, uniqueCharacteristic, speed);
    }
    @Override public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Speed: " + getSpeed() + ", Special Feature: " + getUniqueCharacteristic());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}

