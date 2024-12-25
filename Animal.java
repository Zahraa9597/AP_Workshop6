public abstract class Animal {
    private String name;
    private String age;
    private String uniqueCharacteristic;

    public Animal(String name, String age, String uniqueCharacteristic) {
        this.name = name;
        this.age = age;
        this.uniqueCharacteristic = uniqueCharacteristic;
    }

    public String getName() {

        return name;
    }
    public String getAge() {

        return age;
    }
    public String getUniqueCharacteristic() {
        return this.uniqueCharacteristic;
    }
    public abstract void show();

}
