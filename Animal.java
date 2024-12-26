public abstract class Animal {
    private String name;
    private int age;
    private String uniqueCharacteristic;

    public Animal(String name, int age, String uniqueCharacteristic) {
        this.name = name;
        this.age = age;
        this.uniqueCharacteristic = uniqueCharacteristic;
    }

    public String getName() {

        return name;
    }
    public int getAge() {

        return age;
    }
    public String getUniqueCharacteristic() {
        return this.uniqueCharacteristic;
    }
    public abstract void show();

}
