package com.tianyou.OfferInterview.Alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *  
     *
     * 示例：
     *
     * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     *
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threesumlist=new ArrayList<>();
        //数组为空或小于3个元素直接返回空
        if(nums==null||nums.length<3){
            return threesumlist;
        }

        //对数组按从小到大排序
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            //如果是正数，则一sum定不会等于0，所以break
            if(nums[i]>0){
                break;
            }
            //定义当前下标+1为left下标
            int left=i+1;
            //定义数组末尾为right下标
            int right=nums.length-1;
            //去重
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    //满足条件就把nums[i],nums[left],nums[right]放入list中
                    threesumlist.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //若left下标的值和下一位相等，则left++做去重
                    while (left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    //若right下标的值和前一位相等，则right--做去重
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    //处理完当前left下标的值后开始处理下一个left下标的值
                    left++;
                }else if(sum<0){
                    //sum小于0则left++，换一个更大的数
                    left++;
                }else if(sum>0){
                    //sum大于0则right--,换一个更小的数
                    right--;
                }
            }
        }
        return threesumlist;
    }
}
