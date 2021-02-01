package com.tianyou.OfferInterview.Alibaba.Interview.Day20210201;

import org.junit.Test;

public class FirstTest {

    First first=new First();

    @Test
    public void TestFirst(){
        String ransomNote="aab";
        String magazine="bba";
        boolean result=first.canConstruct(ransomNote,magazine);
        System.out.println(result);
    }
}
