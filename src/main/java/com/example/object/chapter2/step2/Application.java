package com.example.object.chapter2.step2;

import com.example.object.chapter2.step2.discount.discountCondition.SequenceCondition;
import com.example.object.chapter2.step2.discount.discountPlicy.AmountDiscountPolicy;

import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        Movie abata = new Movie("아바타", Duration.ofMinutes(120), Money.wons(1000)
                , new AmountDiscountPolicy(Money.wons(800), new SequenceCondition(1)));
    }
}
