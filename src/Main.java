import animals.Animal;
import animals.pets.Cat;
import animals.pets.Dog;
import animals.pets.Duck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите из меню add/list/exit");
            String choice = sc.next().toUpperCase().trim();

            switch (choice) {
                case "ADD":
                    System.out.println("Какое животное создать  cat / dog / duck");
                    String animalName = sc.next();
                    Animal animal;
                    switch (animalName) {
                        case "cat" -> {
                            animal = new Cat();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                        case "dog" -> {
                            animal = new Dog();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                        case "duck" -> {
                            animal = new Duck();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();

                        }
                    }

                    break;
                case "LIST":
                    for (Animal animal1 : animals) {
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

    public static void createAnimal(Animal animal, Scanner scanner) {
        System.out.println("Имя животного");
        animal.setName(scanner.next());
        System.out.println("Введите возраст");
        animal.setAge(scanner.next());
        System.out.println("Введите вес");
        animal.setWeight(scanner.next());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next());

    }
}
