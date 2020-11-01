package com.tianyou.lagou.Model4.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {

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
        if(array.length==0||array==null){
            return null;
        }

        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                continue;
            }
            map.put(array[i],1);
            list.add(array[i]);
        }
        int length=map.size();
        return list;
    }


    /**
     *  两个有序数组查找合并之后的中位数。给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出这两个正序数组合在一起之后的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     *
     * 你可以假设 nums1 和 nums2 不会同时为空，所有的数字全都不相等。还可以再假设，如果数字个数为偶数个，中位数就是中间偏左的那个元素。
     *
     * 例如：nums1 = [1, 3, 5, 7, 9]
     *
     * nums2 = [2, 4, 8, 12]
     *
     * 输出 5
     * @param array1
     * @param array2
     * @return
     */
    public static int getMedium(int[] array1,int[] array2){
        if(array1.length==0||array1==null||array2.length==0||array2==null){
            return -1;
        }
        return -1;

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
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1copy=new int[m];
        //将nums1复制到一个新的数组对象中
        System.arraycopy(nums1,0,nums1copy,0,m);
        //定义nums1指针
        int p=0;
        //定义nums1copy指针
        int p1=0;
        //定义nums2指针
        int p2=0;

        while (p1<m&&p2<n){
            //比对2个数组的数据，把小的那个值塞到nums1中
            nums1[p++]=(nums1copy[p1]<nums2[p2]) ? nums1copy[p1++]:nums2[p2++];

        }

        if(p1<m){
            //若numscopy没比对完则把numscopy中剩下的数塞到nums1中
            System.arraycopy(nums1copy,p1,nums1,p1+p2,m+n-p1-p2);
        }

        if(p2<n){
            //若nums2没比对完则把numscopy中剩下的数塞到nums1中
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
        }
    }
}
