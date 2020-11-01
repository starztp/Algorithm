package com.tianyou.lagou.Model3.lesson12.Review1;

import org.junit.Test;

public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void Testfindfirstabovetarget(){
        int[] array=new int[]{-1, 3, 3, 7, 10, 14, 14};
        int value=review.findfirstabovetarget(array,9);
        System.out.println(value);
    }
}
