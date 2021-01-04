package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class atoiTest {

    atoi toi=new atoi();

    @Test
    public void TestmyAtoi(){
        String s=" ";
        int result=toi.myAtoi(s);
        System.out.println(result);
    }
}
