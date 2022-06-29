package animals.pets;

public interface flying {
    default void fly() {
        System.out.println("Я лечу");
    }
}