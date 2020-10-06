package com.tianyou.DynamicProgramming;

import org.junit.Test;

public class ClimbStairsTest {

    ClimbStairs climbStairs=new ClimbStairs();

    @Test
    public void TestclimbStairs(){
        int result=climbStairs.climbStairs(10);
        System.out.println(result);
    }
}
