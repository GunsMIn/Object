package com.example.object.chapter1.step1;

import lombok.Getter;

@Getter
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

}
