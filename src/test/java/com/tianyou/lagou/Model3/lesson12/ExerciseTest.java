package com.tianyou.lagou.Model3.lesson12;

import org.junit.Test;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void Testfindfirstabovetarget(){
        int[] array=new int[]{-1, 3, 3, 7, 10, 14, 14 };
        int result=exercise.findfirstabovetarget(array,9);
        System.out.println(result);
    }
}
