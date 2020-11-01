package com.tianyou.lagou.Model2.lesson7.Review1;

import org.junit.Test;

public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void TestgetArrayAverage(){
        int[] array=new int[]{5,6,7,8,9,10};
        int avg=review.getArrayAverage(array);
        System.out.println(avg);
    }
}
