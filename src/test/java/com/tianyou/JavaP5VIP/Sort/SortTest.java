package com.tianyou.JavaP5VIP.Sort;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    Sort sort=new Sort();

    @Test
    public void TestQuicklySort(){
        int[] array = new int[10];
        int[] array1=new int[]{5,4,3,2,1};
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);

        }
        System.out.println(Arrays.toString(array));
        sort.QuicklySort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
