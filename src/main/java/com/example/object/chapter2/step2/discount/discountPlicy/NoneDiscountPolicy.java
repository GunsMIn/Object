package com.example.object.chapter2.step2.discount.discountPlicy;

import com.example.object.chapter2.step2.Money;
import com.example.object.chapter2.step2.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
