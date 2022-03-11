package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)  //타입 -> 
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
