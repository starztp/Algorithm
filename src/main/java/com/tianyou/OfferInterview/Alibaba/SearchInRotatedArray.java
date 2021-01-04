package com.tianyou.OfferInterview.Alibaba;

public class SearchInRotatedArray {

    /**
     * 给你一个整数数组 nums ，和一个整数 target 。
     *
     * 该整数数组原本是按升序排列，但输入时在预先未知的某个点上进行了旋转。（例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] ）。
     *
     * 请你在数组中搜索 target ，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     *
     *  
     * 示例 1：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     * 示例 2：
     *
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     * 示例 3：
     *
     * 输入：nums = [1], target = 0
     * 输出：-1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param array
     * @param target
     * @return
     */
    public int search(int[] array,int target){
        if(array.length==0||array==null){
            return -1;
        }

        int start=0;
        int end=array.length-1;

        while (start+1<end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            if(array[mid]>array[start]){
                if(target>=array[start]&&target<=array[mid]){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                if(target<=array[end]&&target>=array[mid]){
                    start=mid;
                }else {
                    end=mid;
                }
            }
        }

        if(target==array[start]){
            return start;
        }

        if(target==array[end]){
            return end;
        }
        return -1;
    }
}
