package animals.birds;

import animals.Animal;

public class Duck extends Animal implements Flying {
    public void say(){
        fly();
        System.out.println("Кря");
    }
}
