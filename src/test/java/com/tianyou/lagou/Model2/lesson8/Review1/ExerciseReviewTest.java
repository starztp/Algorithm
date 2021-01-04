package com.tianyou.lagou.Model2.lesson8.Review1;

import org.junit.Test;

public class ExerciseReviewTest {

    ExerciseReview review=new ExerciseReview();

    @Test
    public void Testcontain(){
        String str="dabcde";
        String sub="abcde";
        boolean Iscontain=review.contain(str,sub);
        System.out.println(Iscontain);
    }

    @Test
    public void TestgetMaxsubString(){
        String str="dabcde";
        String str1="abcdefabc";
        String maxsubString=review.getMaxsubString(str,str1);
        System.out.println(maxsubString);
    }
}
