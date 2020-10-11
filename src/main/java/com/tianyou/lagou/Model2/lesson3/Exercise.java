package com.tianyou.lagou.Model2.lesson3;

public class Exercise {

    /**
     * 翻转数组
     * @param array
     * @return
     */
    public int[] rotateArray(int[] array){
        for(int i=0;i<array.length/2;i++){
            int originstart=array[i];
            int originend=array.length-1-i;
            array[i]=array.length-1-i;
            originend=originstart;
        }
        return array;
    }
}
