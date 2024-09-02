package com.example.object.chapter2.step1;

import com.example.object.chapter2.step1.discount.discountPlicy.AmountDiscountPolicy;
import com.example.object.chapter2.step1.discount.discountCondition.SequenceCondition;

import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        Movie abata = new Movie("아바타", Duration.ofMinutes(120), Money.wons(1000)
                , new AmountDiscountPolicy(Money.wons(800), new SequenceCondition(1)));
    }
}
