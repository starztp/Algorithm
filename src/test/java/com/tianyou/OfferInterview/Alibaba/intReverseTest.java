package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class intReverseTest {

    intReverse reverse=new intReverse();

    @Test
    public void Testreverse(){
        int a=1534236469;
        int reverseint=reverse.reverse(a);
        System.out.println(reverseint);
    }
}
