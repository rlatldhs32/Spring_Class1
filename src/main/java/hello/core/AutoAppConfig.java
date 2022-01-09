package hello.core;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //설정정보
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes=Configuration.class)
        //컴포넌트 스캔으로 다 뒤져서 스프링 빈으로 등록하는데,뺄꺼를 지정해줌
)
public class AutoAppConfig {

}
