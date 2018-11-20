package com.telesens.academy.EntryTests;

import com.telesens.academy.lesson12_Generic.Entry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryTests {

    @Test
    public void testSimpleEntry() {
        System.out.println("start 'testSimpleEntry'");
        long key = 12L;
        String value = "demoValue";

        Entry entry = new Entry(key, value);
        Entry entryEqual = new Entry(key, value);

        Assert.assertEquals(key, entry.getKey());
        Assert.assertEquals(value, entry.getValue());

        Assert.assertEquals(entry, entryEqual);
    }
}
