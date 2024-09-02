package com.example.object.chapter2.step2.discount.discountPlicy;

import com.example.object.chapter2.step2.Money;
import com.example.object.chapter2.step2.Screening;
import com.example.object.chapter2.step2.discount.discountCondition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }
}
