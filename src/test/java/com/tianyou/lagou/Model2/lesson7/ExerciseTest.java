package com.tianyou.lagou.Model2.lesson7;

import org.junit.Test;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void TestgetArrayAverage(){
        int[] array=new int[]{1,2,3,4,5};
        int avg=exercise.getArrayAverage(array);
        System.out.println(avg);
    }

    @Test
    public void TestremoveRepeat(){
        int[] array=new int[]{1,2,3,3,5};
        int length=exercise.removeRepeat(array);
        System.out.println(length);
    }
}
