package Task2;

import java.lang.annotation.*;

/**
 * This is an annotation, what keeping two numbers for Calculator
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NumbersForCalculator {
    /**
     * First Number for Calculator
     * @return an initial first number for calculator
     */
    int num1() default 1;

    /**
     * Second Number for Calculator
     * @return an initial second number for calculator
     */
    int num2() default 1;
}
