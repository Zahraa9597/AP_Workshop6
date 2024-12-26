public class Bird extends Animal{
    private int heightOfFly;

    public Bird(String name, int age, String uniqueCharacteristic, int heightOfFly) {
        super(name, age, uniqueCharacteristic);
        this.heightOfFly = getHeightOfFly();
    }


    public int getHeightOfFly() {
        return heightOfFly;
    }

    @Override
    public void show() {

    }

}
