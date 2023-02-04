package Task3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MyClass3 myClass = new MyClass3();
        Class<?> cl = myClass.getClass();
        try {
            Method method = cl.getMethod("method");
            Task3.Annotation annotation = method.getAnnotation(Annotation.class);
            System.out.println(annotation.str().toString());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
