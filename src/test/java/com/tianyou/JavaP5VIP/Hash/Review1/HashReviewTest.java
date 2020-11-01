package com.tianyou.JavaP5VIP.Hash.Review1;

import org.junit.Test;

public class HashReviewTest {

    HashReview hashReview=new HashReview();

    @Test
    public void TestlengthOfLongestSubstringTry(){
        String s="pwwkew";
        int length=hashReview.lengthOfLongestSubstringTry(s);
        System.out.println(length);
    }
}
