package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;
import java.util.List;

public class GenerateParenthesisTest {
    GenerateParenthesis generateParenthesis=new GenerateParenthesis();

    @Test
    public void TestgenerateParenthesis(){
        List<String> result= generateParenthesis.generateParenthesis(3);
        System.out.println(result.toString());
    }

    @Test
    public void TestgenerateParenthesis1(){
        List<String> result= generateParenthesis.generateParenthesis1(3);
        System.out.println(result.toString());
    }

    @Test
    public void TestgenerateParenthesis2(){
        List<String> result= generateParenthesis.generateParenthesis2(3);
        System.out.println(result.toString());
    }
}
