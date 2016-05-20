package ru.dimka3210;

import java.util.ArrayList;
import java.util.List;

public class BSearch {
    public int iterationCount = 0;

    public ArrayList<Integer> data = new ArrayList();

    public void fill(int max) {
        for (int i = 0; i < max; i++) {
            data.add(i);
        }
    }

    public int search(int needle) {
        System.out.println("Start search needle: " + needle + " by array " + data.size() + " element");
        return search(data, needle);
    }

    public int search(List<Integer> part, int needle) {
        iterationCount++;
        int size = part.size();

        if (size == 1) {
            return part.get(0);
        }

        int middleKey = (int) size / 2;
        int middleValue = (int) part.get(middleKey);

        if (middleKey + 1 >= part.size() - 1) {
            return part.get(part.size() - 1);
        }
        try {

            if (needle > middleValue) {
                return search(part.subList(middleKey + 1, part.size() - 1), needle); //right
            } else {
                return search(part.subList(0, middleKey), needle); // left
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException " + (middleKey + 1) + " | " + (part.size() - 1));
        }
        return  0;
    }
}
