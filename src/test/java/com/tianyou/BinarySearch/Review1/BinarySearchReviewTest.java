package com.tianyou.BinarySearch.Review1;

import com.tianyou.BinarySearch.BinarySearchTry;
import org.junit.Test;

public class BinarySearchReviewTest {

    BinarySearchReview binarySearchReview=new BinarySearchReview();

    @Test
    public void TestSearchInRotatedSortedArray2(){
        int[] array=new int[]{1,1,3,1};
        int target=3;
        boolean result=BinarySearchReview.SearchInRotatedSortedArray2(array,target);
        System.out.println(result);
    }
}
