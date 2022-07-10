package animals;

public abstract class Animal {


    private String weight;
    private String age;
    private String name;
    private String color;
    private String eat;
    private String drink;
    private String go;
    private String say;


    String ageToString (int age)
    {
        switch (age % 10) {
            case 1:
                return age + " год";
            case 2:
            case 3:
            case 4:
                return age + " года";
            default:
                return age + " лет";
        }
    }

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

    public void setAge(String age) {

        this.age = age;
    }

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

        return "Привет! меня зовут " + name + ", мой возраст "+ageToString(Integer.parseInt(age))+" , я вешу - " + weight + " кг, мой цвет - " + color + "";
    }

}
