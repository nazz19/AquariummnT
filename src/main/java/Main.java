
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();
        System.out.println("Type how many fishes you`d like to add: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Name : ");
            String name = scanner.next();
            System.out.println("Age : ");
            int age = scanner.nextInt();
            System.out.println("Size : ");
            int size = scanner.nextInt();
            aquarium.addSpecies(name, size, age);
        }

        System.out.println("Name of a fish you want to change: ");
        String nameF = scanner.next();


        System.out.println("New age for a fish:");
        int newAge = scanner.nextInt();
        aquarium.changeAge(nameF, newAge);

        System.out.println("New size for a fish:");
        int sizeF = scanner.nextInt();
        aquarium.changeSize(nameF, sizeF);

        System.out.println("Type index of fish that you want to remove");
        int indexRemove = scanner.nextInt();
        aquarium.remove(indexRemove);
        aquarium.printAllSpecies();
    }
}
