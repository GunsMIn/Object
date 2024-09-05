package com.example.object.chapter11.step2;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Lecture lecture = new Lecture("객체지향 프로그래밍",70,  Arrays.asList(81, 95, 75, 50, 45));
        lecture.evaluate();

    }
}
