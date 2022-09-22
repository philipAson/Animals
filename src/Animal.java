public class Animal {

    String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;

    }

    public void eat(String food) {
        System.out.println(this.name + " eating banana!");

    }
}
