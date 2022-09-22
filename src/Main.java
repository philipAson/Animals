import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hyena h1 = new Hyena("Sven");
        Hyena h2 = new Hyena("Ola");

        Lion l1 = new Lion("Lena");
        Lion l2 = new Lion("Nettan");

        ArrayList<Animal> djurIndex = new ArrayList<>();

        djurIndex.add(l1);
        djurIndex.add(l2);
        djurIndex.add(h1);
        djurIndex.add(h2);

        for (Animal k : djurIndex) {
            System.out.println(k.getName());
        }
    }
}