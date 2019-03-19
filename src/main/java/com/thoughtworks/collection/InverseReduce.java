package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> divideList=new ArrayList<>();
        int step=random.nextInt(3);
        while (number-step>0){
            divideList.add(number-step);
            number-=step;
        }
        return divideList;
    }
}
