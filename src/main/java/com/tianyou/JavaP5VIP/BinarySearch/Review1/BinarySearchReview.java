package com.tianyou.JavaP5VIP.BinarySearch.Review1;

public class BinarySearchReview {

    /**
     * 使用二分查找在给出的一组有序的数据区间中，是否能找到目标值
     * @param start     区间最小数字
     * @param end       区间最大数字
     * @param target    目标值
     * @return
     */
    public static boolean BinarySearch(int start,int end,int target){
        if(start>end||target<start||target>end){
            return false;
        }

        int mid=start+(end-start)/2;
        if(start==target||mid==target||end==target){
            return true;
        }

        if(target>mid){
            start=mid;
        }

        if(target<mid){
            end=mid;
        }

        return BinarySearch(start,end,target);
    }

    /**
     * 在一串旋转排序的数组里找到目标位置，比如（456789123）
     * @param array
     * @param target
     * @return
     */
    public static int SearchInRotatedSortedArray(int[] array,int target){

        if(array.length<1||array==null){
            return -1;
        }

        int start=0;
        int end=array.length-1;


        while (start+1<end){
            int mid=start+(end-start)/2;
            if(array[start]==target){
                return start;
            }

            if(array[mid]==target){
                return mid;
            }

            if(array[end]==target){
                return end;
            }

            if(array[mid]>array[start]){
                if(target<array[mid]){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                if(target>array[mid]){
                    start=mid;
                }else {
                    end=mid;
                }
            }
        }

        return -1;
    }

    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     *
     * ( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
     *
     * 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
     *
     * 示例 1:
     *
     * 输入: nums = [2,5,6,0,0,1,2], target = 0
     * 输出: true
     * 示例 2:
     *
     * 输入: nums = [2,5,6,0,0,1,2], target = 3
     * 输出: false
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param array
     * @param target
     * @return
     */
    public static boolean SearchInRotatedSortedArray2(int[] array,int target){
        if(array.length<1||array==null){
            return false;
        }

        int start=0;
        int end=array.length-1;


        while (start<=end){
            int mid=start+(end-start)/2;

            if(array[start]==target||array[mid]==target||array[end]==target){
                return true;
            }

            if(array[mid]==array[start]){
                start++;
                continue;
            }

            if(array[mid]>array[start]){
                if(target<array[mid]&&target>array[start]){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                if(target>array[mid]&&target<array[end]){
                    start=mid;
                }else {
                    end=mid;
                }
            }
        }
        return false;
    }

    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     *
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     *
     * 请找出其中最小的元素。
     *
     * 你可以假设数组中不存在重复元素。
     *
     * 示例 1:
     *
     * 输入: [3,4,5,1,2]
     * 输出: 1
     * 示例 2:
     *
     * 输入: [4,5,6,7,0,1,2]
     * 输出: 0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param array
     * @return
     */
    public static int SearchMinInRotatedSortedArray(int[]array){

        if(array.length<1||array==null){
            return -1;
        }

        int start=0;
        int end=array.length-1;

        while (start+1<end){
            int mid=start+(end-start)/2;

            if(array[mid]<array[end]){
                end=mid;
            }else {
                start=mid;
            }
        }

        return Math.min(array[start],array[end]);
    }
}
