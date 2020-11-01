package com.tianyou.lagou.Model2.lesson3.Review;

import com.tianyou.lagou.Model2.lesson3.Review1.ExerciseReview;
import org.junit.Test;

import java.util.Arrays;

public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void TestrotateArray(){
        int[] array=new int[]{1,2,3,4,5};
        int[] result=review.rotateArray(array);
        System.out.println(Arrays.toString(result));
    }
}
