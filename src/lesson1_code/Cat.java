package lesson1_code;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {

    private boolean isWild;

    private int swimmSpeed;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color, int age, int swimmSpeed) {
        super(name, color, age);
        this.swimmSpeed = swimmSpeed;
    }

    public double getSwimmSpeed() {
        return swimmSpeed;
    }

    public void setSwimmSpeed(int swimmSpeed) {
        this.swimmSpeed = swimmSpeed;
    }


    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("MYA");
    }

    public double swim(Pool pool) {
        System.out.println("Im cat and i am swimming");
        double timeToOvercome = pool.getLength() / swimmSpeed;
        System.out.println("i spent " + timeToOvercome + " minutes");

        return timeToOvercome;

    }

}
