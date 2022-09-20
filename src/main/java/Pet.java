public abstract class Pet{
    private String color;

    public Pet(String color) {
    }

    //public abstract Pet(String color) {
       // this.color = color;
    //}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                '}';
    }

    public abstract void printColor();
}
