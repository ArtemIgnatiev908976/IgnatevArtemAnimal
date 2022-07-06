package animals;

public abstract class Animal {


    public String weight;
    public String age;
    public String name;
    public String color;
    public String eat;
    public String drink;
    public String go;
    public String say;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        eat = eat;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        drink = drink;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        go = go;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        say = say;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {this.age = age;}




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void say() {
        System.out.println("Привет! меня зовут \"+ name +\", я вешу - \"+ weight +\" кг, мой цвет - \"+ color +\"");
    }


    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мой возраст " + age + ", я вешу - " + weight + " кг, мой цвет - " + color + "";
    }
}
