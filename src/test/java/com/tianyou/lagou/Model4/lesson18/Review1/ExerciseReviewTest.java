package com.tianyou.lagou.Model4.lesson18.Review1;

import org.junit.Test;

import java.util.Arrays;
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

    @Test
    public void Testmerge(){
        int[] a=new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int[] b=new int[]{2,5,6};
        review.merge(a,3,b,3);
        System.out.println(Arrays.toString(a));

    }
}
