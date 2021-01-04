package com.tianyou.lagou.Model4.lesson18;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void TestremoveRepeat(){
        int[] array=new int[]{0,0,1,1,1,2,2,3,3,4};
        List<Integer> list=Exercise.removeRepeat(array);
        System.out.println(list.toString());
    }

    @Test
    public void Testmerge(){
        int[] array=new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        int[] array1=new int[]{2,5,6};
        exercise.merge(array,3,array1,3);
        System.out.println(Arrays.toString(array));
    }
}
