package com.tianyou.JavaP5VIP.DynamicProgramming;

import org.junit.Test;

public class UniquePathsTest {

    UniquePaths uniquePaths=new UniquePaths();

    @Test
    public void TestuniquePaths(){
        int result=uniquePaths.uniquePaths(7,3);
        System.out.println(result);
    }
}
