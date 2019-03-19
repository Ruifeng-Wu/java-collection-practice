package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> intervalList;
        if (left < right) {
            return IntStream.rangeClosed(left, right).boxed().collect(toList());
        } else {
            intervalList = getListByInterval(right, left);
            intervalList.sort((o1, o2) -> o1 < o2 ? 1 : -1);
        }
        return intervalList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> intervalList = getListByInterval(left, right);
        return intervalList.stream().filter(x -> x % 2 == 0).collect(toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements=new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i]==secondArray[j]){
                    commonElements.add(firstArray[i]);
                }
            }
        }
        return commonElements;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
