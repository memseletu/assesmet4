public class Dog extends Pet{

    public Dog(String color) {
        super(color);
    }

    @Override
    public void printColor() {
        System.out.println("brown");
    }
}
