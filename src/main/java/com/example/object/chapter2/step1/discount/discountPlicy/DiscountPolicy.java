package com.example.object.chapter2.step1.discount.discountPlicy;

import com.example.object.chapter2.step1.Money;
import com.example.object.chapter2.step1.Screening;
import com.example.object.chapter2.step1.discount.discountCondition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    abstract protected Money getDiscountAmount(Screening Screening);

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

}