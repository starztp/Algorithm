package com.tianyou.lagou.Model3.lesson11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void Testhanota(){
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();
        List<Integer> C=new ArrayList<>();
        A.add(6);
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(1);
        exercise.hanota(A,B,C);
        System.out.println(C.toString());
    }
}
