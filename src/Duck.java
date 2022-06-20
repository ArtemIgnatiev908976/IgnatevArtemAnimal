public class Duck extends Animal implements Flying{

    public void say(){
        System.out.println("Привет! меня зовут "+ name +", я вешу - "+ weight +" кг, мой цвет - "+ color +"");
        fly();
        System.out.println("Кря");
    }

}
