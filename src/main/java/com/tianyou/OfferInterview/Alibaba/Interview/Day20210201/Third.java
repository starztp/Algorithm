package com.tianyou.OfferInterview.Alibaba.Interview.Day20210201;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Third {

    /**
     * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
     *
     * 示例 :
     *
     * 输入: [1,2,1,3,2,5]
     * 输出: [3,5]
     *
     * 注意：
     *
     *     结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
     *     你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        for(int num: map.keySet()){
            if(map.get(num)==2){
                list.add(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
