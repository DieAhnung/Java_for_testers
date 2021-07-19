package Lesson2_code;

import java.io.FileNotFoundException;

public class CalculateSquare {
    public static void main(String[] args) {
        try {
            calcRectangleSquart(-1, 9);
        } catch (OneOrBothRectangleSideisNegativeException exception) {
            exception.printStackTrace();
        }
        System.out.println("alive");

    }

    public static int calcRectangleSquart(int sideA, int sideB) throws OneOrBothRectangleSideisNegativeException {

        if (sideA <= 0 || sideB <= 0) {
            throw new OneOrBothRectangleSideisNegativeException("Одна из сторон отрицательная: " + sideA + "," + sideB);
        }

        return sideA * sideB;
    }

}
