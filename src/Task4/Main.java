package Task4;

import java.lang.reflect.Method;

public class Main {
    public static class AddNumbers {
        @Math(num1 = 5, num2 = 10)
        public void mathSum(int num1, int num2) {
            System.out.println(num1 + num2);
        }
    }

    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();
        Class<?> cl = AddNumbers.class;
        try {
            Method method = cl.getMethod("mathSum", int.class, int.class);
            Math math = method.getAnnotation(Math.class);
            addNumbers.mathSum(math.num1(), math.num2());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}
