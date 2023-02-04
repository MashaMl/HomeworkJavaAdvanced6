package Task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This is Main
 */
public class Main {
    /**
     * This is point to entry in program
     * @param args
     */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Class<?> cl = calculator.getClass();

        try{
            Method[] methods = cl.getMethods();
            for(Method method : methods) {
                NumbersForCalculator numbersForCalculator = method.getAnnotation(NumbersForCalculator.class);
                method.invoke(calculator, numbersForCalculator.num1(), numbersForCalculator.num2());
            }
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
