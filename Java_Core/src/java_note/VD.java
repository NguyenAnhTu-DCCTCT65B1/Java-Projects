package java_note;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

// Cac Annotation duoc tich hop san Su dung trong Annotation khac + Annotation tu dinh nghia

@Retention(RetentionPolicy.RUNTIME)
@Target({  ElementType.TYPE, ElementType.METHOD })
@Inherited
@interface MyAnnotation {
    int value1() default 2;
    double value2() default 8.7;
    String value3() default "Goodbye...";
}

@MyAnnotation
class Super {
	public void E() {
		System.out.println("Say goodbye");
	}
}

class Child extends Super {}

class MyTest {
	@MyAnnotation
	public void method() {
		System.out.println("Hello...");
	}
}

public class VD {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        MyTest m = new MyTest();
        m.method();
        
        Method me = m.getClass().getMethod("method");
        
        MyAnnotation my = me.getAnnotation(MyAnnotation.class);
        System.out.println("Value1 is: " + my.value1());
        System.out.println("Value2 is: " + my.value2());
        System.err.println("Value3 is: " + my.value3());
        
        Annotation a[] = new MyTest().getClass().getAnnotations();
        System.out.println("So luong chu thich duoc dinh kem vao lop A luc RUNTIME la: " + a.length);
        
        MyAnnotation ma = Child.class.getAnnotation(MyAnnotation.class);
        System.out.println(ma.value1());
        System.out.println(ma.value2());
        System.out.println(ma.value3());
	}
}