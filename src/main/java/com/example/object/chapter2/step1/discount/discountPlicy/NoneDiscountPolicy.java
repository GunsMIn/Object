package com.example.object.chapter2.step1.discount.discountPlicy;

import com.example.object.chapter2.step1.Money;
import com.example.object.chapter2.step1.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
