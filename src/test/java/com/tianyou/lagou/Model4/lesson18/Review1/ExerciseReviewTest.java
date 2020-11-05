package com.tianyou.lagou.Model4.lesson18.Review1;

import org.junit.Test;

import java.util.List;

/**
 * Created by tianyou on 2020/11/5.
 */
public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void TestremoveRepeat(){
        int[] array=new int[]{0,0,1,1,1,2,2,3,3,4};
        List<Integer> list=ExerciseReview.removeRepeat(array);
        System.out.println(list.toString());
    }
}
