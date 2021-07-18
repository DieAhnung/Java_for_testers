package lesson1_code;

public class Wolf extends Animal implements CanSwim {

    private int swimmSpeed;

    public Wolf(String name, String color, int age, int swimmSpeed) {
        super(name, color, age);
        this.swimmSpeed = swimmSpeed;
    }

    public double getSwimmSpeed() {
        return swimmSpeed;
    }

    public void setSwimmSpeed(int swimmSpeed) {
        this.swimmSpeed = swimmSpeed;
    }

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }


    @Override
    public void voice() {
        System.out.println("WOO");
    }

    public double swim(Pool pool) {
        System.out.println("Im wolf and i am swimming");
        System.out.println("i spent " + pool.getLength() / swimmSpeed + " minutes") ;
        return pool.getLength() / swimmSpeed;

    }
}
