package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean condition1 = (firstSide + secondSide) > thirdSide;
        boolean condition2 = (secondSide + thirdSide) > firstSide;
        boolean condition3 = (firstSide + thirdSide) > secondSide;
        if ((condition1 && condition2) && condition3)  {
                System.out.println("this is a valid triangle");
        } else {

            System.out.println("it's not a triangle");
        }

    }
}
