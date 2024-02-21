import java.util.ArrayList;
import java.util.List;

public class HorsesHouse<T extends Horse> {
     private List<T> animals;

    public HorsesHouse() {
        this.animals = new ArrayList<>();
    }


    public T addAnimal(T animal) {
       animals.add(animal);
        return animal;
    }

    public List<T> getAllAnimals() {
        return this.animals;
    }

    public void addAllAnimals(List<? extends T> animals) {
        this.animals.addAll(animals);
    }


}
