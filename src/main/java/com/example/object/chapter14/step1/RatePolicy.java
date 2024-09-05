package com.example.object.chapter14.step1;

import com.example.object.chapter14.step1.money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}