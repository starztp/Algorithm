package com.tianyou.BinarySearch;

import org.junit.Test;

public class BinarySearchTryTest {

    @Test
    public void TestBinarySearch(){
        boolean result=BinarySearchTry.BinarySearch(1,100,89);
        System.out.println(result);
    }

    @Test
    public void TestSearchInRotatedSortedArray(){
        int[] array=new int[]{4,5,6,7,0,1,2};
        int cursor=BinarySearchTry.SearchInRotatedSortedArray(array,5);
        //int cursor=BinarySearchTry.search(array,1);
        System.out.println(cursor);
    }

    @Test
    public void TestSearchInRotatedSortedArray2(){
        int[] array=new int[]{4,5,6,7,0,1,2};
        int target=5;
        boolean result=BinarySearchTry.SearchInRotatedSortedArray2(array,target);
        System.out.println(result);
    }

    @Test
    public void TestSearchMinInRotatedSortedArray(){
        int[] array=new int[]{3,4,5,1,2};
        int min=BinarySearchTry.SearchMinInRotatedSortedArray(array);
        System.out.println(min);
    }
}
