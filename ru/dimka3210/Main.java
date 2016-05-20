package ru.dimka3210;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            long startTime = System.currentTimeMillis();
            BSearch bSearch = new BSearch();
            bSearch.fill(10000000);
            System.out.println("Find: " + bSearch.search((int) (Math.random() * 1000)) + " in " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.println("Iteration: " + bSearch.iterationCount);
        }
    }
}
