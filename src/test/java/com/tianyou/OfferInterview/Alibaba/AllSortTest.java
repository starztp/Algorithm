package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

import java.util.List;

public class AllSortTest {

    private AllSort allSort=new AllSort();

    @Test
    public void Testpermute(){
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> result=allSort.permute(nums);
        System.out.println(result.toString());
    }
}
