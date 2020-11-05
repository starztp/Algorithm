package com.tianyou.lagou.Model3.lesson13.Review1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by tianyou on 2020/11/3.
 */
public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void TestquickSort(){
        int[] array=new int[]{5,4,3,2,1};
        int start=0;
        int end=array.length-1;
        review.quickSort(array,start,end);
        System.out.println(Arrays.toString(array));
    }
}
