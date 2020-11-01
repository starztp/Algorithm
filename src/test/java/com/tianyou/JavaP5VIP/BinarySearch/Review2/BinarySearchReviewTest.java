package com.tianyou.JavaP5VIP.BinarySearch.Review2;

import org.junit.Test;

public class BinarySearchReviewTest {

    BinarySearchReview binarySearchReview=new BinarySearchReview();

    @Test
    public void TestSearchInRotatedSortedArray(){
        int[] array=new int[]{1,1,3,1};
        int target=4;
        int result=BinarySearchReview.SearchInRotatedSortedArray(array,target);
        System.out.println(result);
    }

    @Test
    public void TestSearchInRotatedSortedArray2(){
        int[] array=new int[]{1,1,3,1};
        int target=4;
        boolean result=BinarySearchReview.SearchInRotatedSortedArray2(array,target);
        System.out.println(result);
    }



}
