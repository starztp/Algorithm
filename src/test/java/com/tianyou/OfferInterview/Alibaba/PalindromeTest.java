package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class PalindromeTest {

    Palindrome palindrome=new Palindrome();

    @Test
    public void TestlongestPalindrome(){
        String s= "babad";
        String maxSubString=palindrome.longestPalindrome3(s);
        System.out.println(maxSubString);
    }

    @Test
    public void TestisPalindrome(){
        int x=100;
        boolean result=palindrome.isPalindrome(x);
        System.out.println(result);
    }
}
