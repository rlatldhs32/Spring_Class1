package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberServ1ice()
    {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberService memberService()
    {
        return new MemberServiceImpl(memberRepository());
    }

    //ctrl+ alt + m 단축키를 통해 , 기존 memory member repository도
    //생성자를 통해 만듬!!
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    //생성자 주입
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
   }
}
