package com.tianyou.OfferInterview.Alibaba.Interview.Day20210201;

import java.util.HashMap;
import java.util.Map;

public class Second {

    /**
     *给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     *
     *
     * 示例 1：
     *
     * 输入：[3,2,3]
     * 输出：3
     *
     * 示例 2：
     *
     * 输入：[2,2,1,1,1,2,2]
     * 输出：2
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)>(nums.length)/2){
                return num;
            }
        }
        return -1;
    }
}
