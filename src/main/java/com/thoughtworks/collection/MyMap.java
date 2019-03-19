package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
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
        List<String> list = new ArrayList<>(Collections.nCopies(array.size(),""));
        for (int i = 0; i < array.size(); i++) {
            while (array.get(i)>0){
                if (array.get(i)<27){
                    list.set(i, list.get(i)+letterList.get(array.get(i)-1));
                    array.set(i,0);
                }else {
                    list.set(i,letterList.get(0));
                    array.set(i,array.get(i)-26);
                }
            }
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
