package com.tianyou.OfferInterview.Alibaba;

import java.util.WeakHashMap;

public class MedianSortArrays {

    /**
     * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
     *
     * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     *
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * 示例 3：
     *
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     * 示例 4：
     *
     * 输入：nums1 = [], nums2 = [1]
     * 输出：1.00000
     * 示例 5：
     *
     * 输入：nums1 = [2], nums2 = []
     * 输出：2.00000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums3=new int[nums1.length+nums2.length];
        int p1=0;
        int p2=0;
        int p3=0;
        double mid=0;
        int midindex=nums3.length/2;

        while (p1<nums1.length&&p2<nums2.length){
            nums3[p3]=nums1[p1]<nums2[p2]?nums1[p1++]:nums2[p2++];
            p3++;
        }

        if(p1<nums1.length){
            System.arraycopy(nums1,p1,nums3,p1+p2,nums3.length-p3);
        }

        if(p2<nums2.length){
            System.arraycopy(nums2,p2,nums3,p1+p2,nums3.length-p3);
        }

        if(nums3.length%2==0){
            mid=(nums3[midindex]+nums3[midindex-1])/2.0;
        }else {
            mid=nums3[midindex];
        }
        return mid;
    }
}
