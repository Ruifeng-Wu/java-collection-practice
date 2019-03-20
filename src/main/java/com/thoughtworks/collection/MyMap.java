package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().mapToInt(x -> x).mapToObj(x -> x * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream()
                .mapToInt(x -> x)
                .mapToObj(x -> String.valueOf(letterList.get(x - 1)))
                .collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        int lettersNum = letterList.size();
        List<String> lettersMapList = new ArrayList<>(Collections.nCopies(array.size(), ""));
        for (int index = 0; index < array.size(); index++) {
            int temp = array.get(index);
            while (temp != 0) {
                lettersMapList.set(index, letterList.get((temp + lettersNum - 1) % lettersNum) + lettersMapList.get(index));
                temp = (temp - 1) / lettersNum;
            }
        }
        return lettersMapList;
    }

    public List<Integer> sortFromBig() {
        array.sort((o1, o2) -> o1 < o2 ? 1 : -1);
        return array;
    }

    public List<Integer> sortFromSmall() {
        array.sort((o1, o2) -> o1 > o2 ? 1 : -1);
        return array;
    }
}
