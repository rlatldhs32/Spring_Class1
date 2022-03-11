package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)  //타입 ->
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponet {
    //컴포넌트 스캔 대상에서 제외할 것.
}
