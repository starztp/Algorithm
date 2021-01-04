package com.tianyou.lagou.Model2.lesson3;

public class Exercise {

    /**
     * 翻转数组
     * @param array
     * @return
     */
    public int[] rotateArray(int[] array){
        int start=0;
        int end=array.length-1;
        int mid=start+(end-start)/2;
        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }
}
