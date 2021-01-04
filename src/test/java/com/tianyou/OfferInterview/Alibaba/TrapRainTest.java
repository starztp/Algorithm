package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class TrapRainTest {

    TrapRain trapRain=new TrapRain();
    @Test
    public void Testtrap(){
        int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int count=trapRain.trap(height);
        System.out.println(count);
    }
}
