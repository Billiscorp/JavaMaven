package com.telesens.academy.lesson16_File.file;
import java.util.function.Consumer;
public interface ConsumerExceptional<T, E extends Exception> {
    void apply(T t) throws E;
    static <T> Consumer<T> wrap(ConsumerExceptional<T, Exception> consumer) {
        return t-> {
            try {
                consumer.apply(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}