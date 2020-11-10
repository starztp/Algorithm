package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class PalindromeTest {

    Palindrome palindrome=new Palindrome();

    @Test
    public void TestlongestPalindrome(){
        String s= "babad";
        String maxSubString=palindrome.longestPalindrome2(s);
        System.out.println(maxSubString);
    }
}
