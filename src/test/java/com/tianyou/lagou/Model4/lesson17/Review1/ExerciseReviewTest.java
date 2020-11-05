package com.tianyou.lagou.Model4.lesson17.Review1;

import org.junit.Test;

/**
 * Created by tianyou on 2020/11/4.
 */
public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void TestreverseWords(){
        String word="tianyou is the best";
        String result=ExerciseReview.reverseWords(word);
        System.out.println(result);
    }
}
