package com.tianyou.lagou.Model2.lesson13;

import com.tianyou.lagou.Model3.lesson13.Exercise;
import org.junit.Test;

import java.util.Arrays;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void TestbubblingSort(){
        int[] array=new int[]{ 1, 0, 3, 4, 5, -6, 7, 8, 9, 10 };
        exercise.bubblingSort(array);
        System.out.println(Arrays.toString(array));
    }
}
