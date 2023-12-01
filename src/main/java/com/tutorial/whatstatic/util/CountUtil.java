package com.tutorial.whatstatic.util;

public class CountUtil {
    private static int count = 0;

    public static int increaseCount() {
        return ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CountUtil.count = count;
    }
}
