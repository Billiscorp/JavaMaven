package com.telesens.academy.lesson12_Generic;

import java.util.Objects;

public class Entry implements Comparable<Entry> {

    private long key;
    private String value;

    public Entry(long key, String value) {
        this.key = key;
        this.value = value;
    }

    public long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;
        Entry entry = (Entry) o;
        return getKey() == entry.getKey() &&
                Objects.equals(getValue(), entry.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }

    @Override
    public int compareTo(Entry o) {
        return this.getValue().compareTo(o.getValue());
    }



}
