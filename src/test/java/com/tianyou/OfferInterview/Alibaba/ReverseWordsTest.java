package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class ReverseWordsTest {

    ReverseWords reverseWords=new ReverseWords();

    @Test
    public void TestreverseWords(){
        String s="a good   example";
        String reverse=reverseWords.reverseWords(s);
        System.out.println(reverse);
    }
}
