package hello.core1.order;

import hello.core1.discount.DiscountPolicy;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.discount.RateDiscountPolicy;
import hello.core1.member.Member;
import hello.core1.member.MemberRepository;
import hello.core1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    // 지금 이 의존성을 바꿈으로서 OCP ,DIP를 지키질 못했다.
    // 구현체도 의존하고 있었기 때문이다. DIP위반
    // 이는 마치 배우가 배우를 초빙하는 꼴
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    //따라서
    private DiscountPolicy discountPolicy;
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }




    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
