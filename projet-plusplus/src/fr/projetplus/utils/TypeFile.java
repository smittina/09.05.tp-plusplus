package fr.projetplus.utils;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface TypeFile {
	boolean csv() default false;
	boolean xml() default false;
	boolean json() default false;
	boolean yml() default false;
}
