package com.tianyou.lagou.Model2.lesson10;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     *
     *  
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length<1){
            return nums;
        }
        int[] twosum=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    twosum[0]=i;
                    twosum[1]=j;
                    break;
                }
            }
        }
        return twosum;
    }

    /**
     * 自己用hashmap做这道题
     * 但是如果数组里有重复的数据就会返回2个一样的下标，和题目预期不符
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        if(nums==null||nums.length<1){
            return nums;
        }
        int[] twosum=new int[2];
        //保存元素在数组中的位置
        Map<Integer,Integer> sumMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //数组里有重复数据map里就只会保存1个，不会重复保存
            sumMap.put(nums[i],i);
        }

        for(int key:sumMap.keySet()){
            if(sumMap.containsKey(target-key)){
                twosum[0]=sumMap.get(key);
                twosum[1]=sumMap.get(target-key);
                break;
            }
        }
        return twosum;
    }

    /**
     * 根据官方的解题思路再用hashmap来做这道题
     * 符合预期
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumHashMap1(int[] nums, int target) {
        if(nums==null||nums.length<1){
            return nums;
        }
        int[] twosum=new int[2];
        //保存元素在数组中的位置
        Map<Integer,Integer> sumMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //为了避免了重复数据，2个值分别从数组和Map里取
            if(sumMap.containsKey(target-nums[i])){
                twosum[0]=i;
                twosum[1]=sumMap.get(target-nums[i]);
            }
            sumMap.put(nums[i],i);
        }

        return twosum;
    }
}
