package level3ex1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PathToJsonSerializable {
    String directory() default "src/main/java/level2ex1/resources/PathToJsonSerializable.json";
}
