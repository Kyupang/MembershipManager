package hello.core1;

import hello.core1.discount.RateDiscountPolicy;
import hello.core1.member.MemberService;
import hello.core1.member.MemberServiceImpl;
import hello.core1.member.MemoryMemberRepository;
import hello.core1.order.OrderService;
import hello.core1.order.OrderServiceImpl;

public class AppConfig {
    // 서비스는 생성자를 통해 주입받는다.
    // 여기서 생성해줌
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), DiscountPolicy());
    }

    private static RateDiscountPolicy DiscountPolicy() {
        return new RateDiscountPolicy();
    }

}
