package Task2;

/**
 * This is a class for adding two numbers
 */
public class Calculator {
    /**
     * This is a constructor of Calculator
     */
    public Calculator() {}
    /**
     * This is a method for adding two numbers
     * @param num1 is a first number for adding
     * @param num2 is a second number for adding
     */
    @NumbersForCalculator(num1 = 10, num2 = 20)
    public void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    /**
     * This is a method for subtraction two numbers
     * @param num1 is a first number for subtraction
     * @param num2 is a second number for adding subtraction
     */
    @NumbersForCalculator(num1 = 10, num2 = 20)
    public void min(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    /**
     * This is a method for multiplication two numbers
     * @param num1 is a first number for multiplication
     * @param num2 is a second number for multiplication
     */
    @NumbersForCalculator(num1 = 10, num2 = 20)
    public void mul(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    /**
     * This is a method for division two numbers
     * @param num1 is a first number for division
     * @param num2 is a second number for division
     */
    @NumbersForCalculator(num1 = 10, num2 = 20)
    public void dev(int num1, int num2) {
        double res = ((double)num1) / ((double)num2);
        System.out.println(num1 + " / " + num2 + " = " + res);
    }


}
