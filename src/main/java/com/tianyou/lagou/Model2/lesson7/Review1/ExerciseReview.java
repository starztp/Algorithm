package com.tianyou.lagou.Model2.lesson7.Review1;

import java.util.HashMap;
import java.util.Map;

public class ExerciseReview {

    /**
     * 删除数组最大和最小值，然后取平均值
     * @param array
     * @return
     */
    public int getArrayAverage(int[] array){
        if(array==null||array.length==0){
            return 0;
        }

        int sum=0;
        int max=0;
        int min=10000;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=i;
            }

            if(array[i]<min){
                min=i;
            }
        }

        if(min>max){
            int temp=max;
            max=min;
            min=temp;
        }

        for(int i=max;i<array.length-1;i++){
            array[i]=array[i+1];
        }

        for(int i=min;i<array.length-1;i++){
            array[i]=array[i+1];
        }

        for(int i=0;i<array.length;i++){

            sum+=array[i];
        }

        int avg=sum/array.length;
        return avg;
    }
}
