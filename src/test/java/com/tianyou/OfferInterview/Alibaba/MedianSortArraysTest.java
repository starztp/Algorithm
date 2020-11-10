package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class MedianSortArraysTest {

    MedianSortArrays medianSortArrays=new MedianSortArrays();

    @Test
    public void TestfindMedianSortedArrays(){
        int[] nums1=new int[]{1,2};
        int[] nums2=new int[]{3,4};
        double mid=medianSortArrays.findMedianSortedArrays(nums1,nums2);
        System.out.println(mid);
    }
}
