public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String eat(){
        return "Meow Meow!";
    }

    @Override
    public String toString() {
        return "This is:" + name;
    }
}
