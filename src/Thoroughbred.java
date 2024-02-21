public class Thoroughbred extends Horse {
    public Thoroughbred(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says  \"I am thoroughbred horse!\"");
    }
}
