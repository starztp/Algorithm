package com.tianyou.lagou.Model2.lesson7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise {

    /**
     * 删除数组最大和最小值，然后取平均值
     * @param array
     * @return
     */
    public int getArrayAverage(int[] array){
        int max=0;
        int min=0;
        int sum=0;
        int avg=0;
        for(int i=1;i<array.length;i++){
            if(array[i]>array[max]){
                max=i;
            }
            if(array[i]<array[min]){
                min=i;
            }
        }

        if(max<min){
            int cusor=max;
            max=min;
            min=cusor;
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
        avg=sum/array.length;
        return avg;
    }


    /**
     * 数组中删除重复元素,返回新数组的长度
     * @param array
     * @return
     */
    public int removeRepeat(int[] array){
        Map<Integer,Integer> elementTimeMapping=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(elementTimeMapping.containsKey(array[i])){
                elementTimeMapping.put(array[i],elementTimeMapping.get(array[i])+1);
            }else {
                elementTimeMapping.put(array[i],1);
            }
        }
        return elementTimeMapping.size();
    }

}
