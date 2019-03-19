package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Collections.addAll(list, array[i]);
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return transformToOneDimesional().stream().distinct().collect(toList());
    }
}
