package com.tianyou.lagou.Model4.lesson18.Review1;

import java.util.ArrayList;
import java.util.Arrays;
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

    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     *  
     *
     * 说明：
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *  
     *
     * 示例：
     *
     * 输入：
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * 输出：[1,2,2,3,5,6]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n){

        int[] nums1copy= new int[m];
        System.arraycopy(nums1,0,nums1copy,0,m);

        int p1=0;
        int p2=0;
        int p1copy=0;

        while (p1copy<nums1copy.length&&p2<nums2.length){
            nums1[p1]=nums1copy[p1copy]<nums2[p2]?nums1copy[p1copy++]:nums2[p2++];
            p1++;
        }

        if(p1copy<m){
            System.arraycopy(nums1copy,p1copy,nums1,p1,nums1.length-p1);
        }

        if(p2<n){
            System.arraycopy(nums2,p2,nums1,p1,nums1.length-p1);
        }
    }
}
