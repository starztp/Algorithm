package com.tianyou.OfferInterview.Alibaba.Interview.Day20210201;

import org.junit.Test;

import java.util.Arrays;

public class ThirdTest {

    Third third=new Third();

    @Test
    public void TestsingleNumber(){
        int[] nums=new int[]{1,2,1,3,2,5};
        int[] resultnums=third.singleNumber(nums);
        System.out.println(Arrays.toString(resultnums));
    }
}
