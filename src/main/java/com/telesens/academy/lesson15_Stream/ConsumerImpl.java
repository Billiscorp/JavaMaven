package com.telesens.academy.lesson15_Stream;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("next el: " + s);
    }
}
