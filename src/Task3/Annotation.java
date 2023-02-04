package Task3;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Deprecated
public @interface Annotation {
    String str() default "Hello World!";
}
