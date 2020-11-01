package com.tianyou.lagou.Model1.lesson2.Review1;

import java.util.HashMap;
import java.util.Map;

public class ExerciseReview {

    /**
     * 查找数组中出现次数最多的元素
     * @param array
     * @return
     */
    public int maxTimeElementInArray(int[] array){
        if(array.length==0||array==null){
            return -1;
        }

        int maxtime=-1;
        int max=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int count=map.get(array[i]);
                map.put(array[i],count+1);
                continue;
            }
            map.put(array[i],1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>maxtime){
                maxtime=map.get(key);
                max=key;
            }
        }
        return max;
    }
}
