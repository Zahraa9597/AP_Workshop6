public class Parrot extends Bird implements Prey {

    public Parrot(String name, String age, String uniqueCharacteristic, String heightOfFly) {
        super(name, age, uniqueCharacteristic, heightOfFly);
    }
    @Override public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Flight Height: " + getHeightOfFly() + ", Special Feature: " + getUniqueCharacteristic());
    }
}

