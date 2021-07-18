package lesson1_code;

public class Turtle extends Animal implements CanSwim {

    private int swimmSpeed;

    public Turtle(String name, String color, int age, int swimmSpeed) {
        super(name, color, age);
        this.swimmSpeed = swimmSpeed;
    }

    public double getSwimmSpeed() {
        return swimmSpeed;
    }

    public void setSwimmSpeed(int swimmSpeed) {
        this.swimmSpeed = swimmSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }


    @Override
    public void voice() {
        System.out.println("KRrr");
    }

    public double swim(Pool pool) {
        System.out.println("Im turtle and i am swimming");
        System.out.println("i spent " + pool.getLength() / swimmSpeed + " minutes");
        return pool.getLength() / swimmSpeed;

    }
}
