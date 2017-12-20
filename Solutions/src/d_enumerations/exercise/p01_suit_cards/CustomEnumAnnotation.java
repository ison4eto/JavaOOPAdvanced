package d_enumerations.exercise.p01_suit_cards;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomEnumAnnotation {
    String type() default "Enumeration";

    String description();

    String category();
}
