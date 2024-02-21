public class ArabianHorse extends Horse {
    public ArabianHorse(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says \"I am arabian horse!\"");
    }
    }