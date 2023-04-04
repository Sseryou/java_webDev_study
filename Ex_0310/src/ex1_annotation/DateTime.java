package ex1_annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(METHOD) //범위를 메서드로 제한을 한다.

public @interface DateTime {
	String date();
	String time();

}
