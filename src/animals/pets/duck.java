package animals.pets;

import animals.animal;

public class duck extends animal implements flying {
    public void say(){
        fly();
        System.out.println("Кря");
    }
}
