public class Bird extends Animal{
    private int heightOfFly;

    public Bird(String name, String age, String uniqueCharacteristic, String heightOfFly) {
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
