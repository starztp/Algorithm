package com.tianyou.lagou.Model4.lesson18.Review1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianyou on 2020/11/5.
 */
public class ExerciseReview {

    /**
     * 【题目】 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后的数组和新的长度，你不需要考虑数组中超出新长度后面的元素。
     *
     * 要求：空间复杂度为 O(1)，即不要使用额外的数组空间。
     *
     * 例如，给定数组 nums = [1,1,2]，函数应该返回新的长度 2，并且原数组 nums 的前两个元素被修改为 1, 2。又如，给定 nums = [0,0,1,1,1,2,2,3,3,4]，函数应该返回新的长度 5，并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     * @param array
     * @return
     */
    public static List<Integer> removeRepeat(int[] array){
        int temp=array[0];
        int length=1;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<array.length;i++){
            if(temp!=array[i]){
                //若不相等temp向前挪一位，准备和下一位做对比
                temp=array[i];
                //数组当前长度的坐标数值为array[i]
                array[length]=array[i];
                //若不相等则length+1
                length++;
            }
        }

        for(int i=0;i<length;i++){
            list.add(array[i]);
        }
        return list;
    }
}
