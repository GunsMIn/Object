package com.example.object.chapter2.step2.discount.discountCondition;

import com.example.object.chapter2.step2.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
