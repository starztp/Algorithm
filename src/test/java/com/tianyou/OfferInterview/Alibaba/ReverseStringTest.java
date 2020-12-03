package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class ReverseStringTest {

    ReverseString reverseString=new ReverseString();

    @Test
    public void TestreverseString(){
        char[] s=new char[]{'h','e','l','l','o'};
        reverseString.reverseString(s);
    }
}
