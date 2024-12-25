public class Eagle extends Bird implements Hunter{

    public Eagle(String name, String age,String uniqueCharacteristic, String heightOfFly) {
        super(name, age,uniqueCharacteristic, heightOfFly);
    }
    @Override public void show() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Flight Height: " + getHeightOfFly() + ", Special Feature: " + getUniqueCharacteristic());
    }

}
