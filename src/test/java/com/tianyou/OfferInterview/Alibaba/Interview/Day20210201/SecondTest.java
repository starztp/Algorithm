package com.tianyou.OfferInterview.Alibaba.Interview.Day20210201;

import org.junit.Test;

public class SecondTest {

    Second second=new Second();

    @Test
    public void TestSecond(){
        int[] nums=new int[]{3,2,3};
        int num=second.majorityElement(nums);
        System.out.println(num);
    }
}
