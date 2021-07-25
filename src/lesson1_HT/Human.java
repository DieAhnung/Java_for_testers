package lesson1_HT;

/**
 * Объект класса человек
 */

public class Human implements RunnerType {

    private String name;
    private int MaxRunDistance;
    private int MaxJumpHeight;
    private boolean able = true; // параметр для проверки на преодоления полосы препятствий

    public Human(String name, int MaxRunDistance, int MaxJumpHeight) {
        this.name = name;
        this.MaxRunDistance = MaxRunDistance; // Высота прыжка
        this.MaxJumpHeight = MaxJumpHeight; //Дистанция бега
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxDist() {
        return MaxRunDistance;
    }

    @Override
    public int getMaxHeight() {
        return MaxJumpHeight;
    }

    @Override
    public void doIt(Obstacle ob) {

        if (able) {
            if (ob instanceof Wall) {

                if (ob.getParam() > 0 && ob.getParam() <= MaxJumpHeight) {
                    jump();
                } else if (ob.getParam() > MaxJumpHeight) {
                    System.err.println(this.name + " cat't jump on " + ob.getParam() +
                            " meters and falls out of the race");
                    this.able = false;
                } else {
                    System.err.println("Please find a wall");
                }

            } else if (ob instanceof Runningtrack) {
                if (ob.getParam() > 0 && ob.getParam() <= MaxRunDistance) {
                    run();
                } else if (ob.getParam() > MaxRunDistance) {
                    System.err.println(this.name + " can't race on " + ob.getParam()
                            + " meters and falls out of the race");
                    this.able = false;
                } else {
                    System.err.println("Некуда бежать!");
                }

            }
        }

    }


    public void run() {
        System.out.println(this.name + " finishes this race! Congratulations!");
    }

    public void jump() {
        System.out.println(this.name + " finishes this jump! Nice Try!");
    }

}

