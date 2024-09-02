package com.example.object.chapter2.step2.discount.discountPlicy;

import com.example.object.chapter2.step2.Money;
import com.example.object.chapter2.step2.Screening;
import com.example.object.chapter2.step2.discount.discountCondition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }


    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
