package lesson1_HT;

/**
 * Объект класса робот
 */

public class Robot implements RunnerType{

    private String model; // Модель
    private int MaxRunDistance;
    private int MaxJumpHeight;
    private boolean able = true; // параметр для проверки на преодоления полосы препятствий


    public Robot(String model, int MaxRunDistance, int MaxJumpHeight) {
        this.model = model;
        this.MaxRunDistance = MaxRunDistance; // Высота прыжка
        this.MaxJumpHeight = MaxJumpHeight; //Дистанция бега
    }



    @Override
    public String getName() {
        return model;
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
        if  (able) {
            if (ob instanceof Wall) {

                if (ob.getParam() > 0 && ob.getParam() <= MaxJumpHeight) {
                    jump();
                }
                else if (ob.getParam() > MaxJumpHeight) {
                    System.err.println(this.model + " can't jump, please update the robot");
                    this.able = false;
                }
                else {
                    System.err.println("Please find a wall");
                }

            }
            else if (ob instanceof Runningtrack) {
                if (ob.getParam() > 0 && ob.getParam() <= MaxRunDistance) {
                    run();
                }
                else if (ob.getParam() > MaxRunDistance) {
                    System.err.println(this.model + " can't race on " + ob.getParam()
                            + " meters and falls out of the race");
                    this.able = false;
                }
                else {
                    System.err.println("No way");
                }

            }
        }
    }


    public void run() {
        System.out.println(this.model + " finishes this race! Congratulations!");
    }

    public void jump() {
        System.out.println(this.model + " finishes this jump! Nice Try!");
    }

}
