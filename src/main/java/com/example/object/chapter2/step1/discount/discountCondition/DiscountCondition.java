package com.example.object.chapter2.step1.discount.discountCondition;

import com.example.object.chapter2.step1.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
