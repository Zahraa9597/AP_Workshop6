public class Eagle extends Bird implements Hunter {

    public Eagle(String name, int age, String uniqueCharacteristic, int heightOfFly) {
        super(name, age, uniqueCharacteristic, heightOfFly);
    }

    @Override
    public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Flight Height: " + getHeightOfFly() + ", Special Feature: " + getUniqueCharacteristic());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }


}