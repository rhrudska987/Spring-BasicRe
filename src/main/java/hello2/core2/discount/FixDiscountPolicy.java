package hello2.core2.discount;

import hello2.core2.discount.DiscountPolicy;
import hello2.core2.member.Grade;
import hello2.core2.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP)
            return discountFixAmount;
        else
            return 0;
    }
}
