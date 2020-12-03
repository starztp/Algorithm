package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix prefix=new LongestCommonPrefix();

    @Test
    public void TestlongestCommonPrefix(){
        String[] strs=new String[]{"flower","flower","flower","flower"};
        String commonPrefix=prefix.longestCommonPrefix(strs);
        System.out.println(commonPrefix);
    }
}
