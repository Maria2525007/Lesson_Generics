import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HorsesHouse<Horse> horseHouse = new HorsesHouse<>();

        horseHouse.addAnimal(new ArabianHorse("Arabi"));
        horseHouse.addAnimal(new Thoroughbred("Cleary"));
        horseHouse.addAnimal(new Horse("SpringHorse") {
            @Override
            public void makeSound() {
                System.out.println("Spriiiing");
            }
        });

        System.out.println(horseHouse.getAllAnimals());

        for (Horse horse : horseHouse.getAllAnimals()) {
            horse.eat();
            horse.sleep();
            horse.makeSound();
        }

        System.out.println("----------------");


        List<Horse> moreHorses = Arrays.asList(
                new ArabianHorse("Rusty"),
                new Thoroughbred("Lightning")
        );
        horseHouse.addAllAnimals(moreHorses);

        System.out.println(horseHouse.getAllAnimals());

        for (Horse horse : horseHouse.getAllAnimals()) {
            horse.eat();
            horse.sleep();
            horse.makeSound();
        }

    }
}