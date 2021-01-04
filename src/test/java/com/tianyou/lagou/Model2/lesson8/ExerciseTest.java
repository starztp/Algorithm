package com.tianyou.lagou.Model2.lesson8;

import org.junit.Test;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void Testcontain(){
        String str="lgoodgoogle";
        String sub="gle";
        boolean result=exercise.contain(str,sub);
        System.out.println(result);
    }

    @Test
    public void TestgetMaxsubString(){
        String str="dbcd";
        String str1="abcef";
        String maxSubString=exercise.getMaxsubString(str,str1);
        System.out.println(maxSubString);
    }

    @Test
    public void TestgetMaxsubString1(){
        String str="lgoodgoogle";
        String str1="sagleaa";
        String maxSubString=exercise.getMaxsubString1(str,str1);
        System.out.println(maxSubString);
    }

    @Test
    public void TestgetMaxsubString2(){
        String str="dbd";
        String str1="abef";
        String maxSubString=exercise.getMaxsubString2(str,str1);
        System.out.println(maxSubString);
    }
}
