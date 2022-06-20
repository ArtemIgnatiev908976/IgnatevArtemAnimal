import java.util.Objects;

public abstract class Animal {


    public int weight;
    public int age;
    public String name;
    public String color;



    public String Eat;
    public String Drink;
    public String Go;
    public String Say;


    public String getEat() {return Eat;}

    public void setEat(String eat) {
        Eat = eat;
    }

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public String getGo() {
        return Go;
    }

    public void setGo(String go) {Go = go;}

    public String getSay() {
        return Say;
    }

    public void setSay(String say) {Say = say;}






    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    protected void say() {
        System.out.println("Привет! меня зовут \"+ name +\", я вешу - \"+ weight +\" кг, мой цвет - \"+ color +\"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && age == animal.age && color.equals(animal.color) && name.equals(animal.name) && Eat.equals(animal.Eat) && Drink.equals(animal.Drink) && Go.equals(animal.Go) && Say.equals(animal.Say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, age, name, Eat, Drink, Go, Say);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
