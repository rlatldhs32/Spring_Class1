package hello.core.xml;

import hello.core.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.support.GenericXmlContextLoader;

public class XmlAppContext {

    @Test
    void XmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("AppConfig.xml");
        Object bean = ac.getBean("memberService.class");
        Assertions.assertThat(bean).isInstanceOf(MemberRepository.class);
    }
}
