import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите из меню add/list/exit");
            String choice = sc.next().toUpperCase().trim();

            switch (choice) {
                case "ADD":
                    System.out.println("Какое животное создать  cat / dog / duck");
                    String animalName = sc.next();
                    animal animal;
                    switch (animalName) {
                        case "cat" -> {
                            animal = new cat();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                        case "dog" -> {
                            animal = new dog();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                        case "duck" -> {
                            animal = new duck();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                    }

                    break;
                case "LIST":
                    for (animal animal1 : animals) {
                        System.out.println(animal1);
                    }
                    break;
                case "EXIT":
                    System.out.println("выход");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
    public static void createAnimal(animal animal, Scanner scanner) {
        System.out.println("Имя животного");
        animal.setName(scanner.next());
        System.out.println("Введите возраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next());

    }
}
