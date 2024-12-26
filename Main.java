import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle", 5, "Sharp eyesight", 100);
        Parrot parrot = new Parrot("Parrot", 3, "Colorful feathers", 30);
        Cheetah cheetah = new Cheetah("Cheetah", 4, "The fastest", 120);
        Giraffe giraffe = new Giraffe("Giraffe", 6, "Long neck", 15);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(eagle);
        animals.add(parrot);
        animals.add(cheetah);
        animals.add(giraffe);

        for (Animal animal : animals) {
            animal.show();
        }
        cheetah.hunt(parrot);
        cheetah.hunt(giraffe);
        eagle.hunt(parrot);
        eagle.hunt(giraffe);
    }

}