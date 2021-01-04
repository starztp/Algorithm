package com.tianyou.JavaP5VIP.BinarySearch;

/**
 * 二分查找
 */
public class BinarySearchTry {

    /**
     * 使用二分查找在给出的一组有序的数据区间中，是否能找到目标值
     * @param start     区间最小数字
     * @param end       区间最大数字
     * @param target    目标值
     * @return
     */
    public static boolean BinarySearch(int start,int end,int target){
        boolean result=false;
        if(!(start<end)||target<start||target>end){
            System.out.println("参数不合法");
            return result;
        }
        //定义2数之间的平均值
        //int mid=(end+start)/2;
        int mid=start+(end-start)/2;
        if(mid==target){
            result=true;
            return result;
        }else if(target>mid){
            start=mid;
        }else if(target<mid){
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

        if (array == null || array.length == 0) {
            return -1;
        }

        int cursor=-1;
        int start=0;
        int end=array.length-1;


        //这里不用start<end的条件判断是为了防止（[1,3]，2）这样只有2个元素的数组的参数从而导致无限循环
        while (start+1<end){
            int mid=start+(end-start)/2;

            if(target==array[mid]){
                return mid;
            }
            //判断数组前半段是否是有序数列
            if(array[start]<array[mid]){
                //判断target是否在数组前半段
                if(target>=array[start] && array[mid]>=target){
                    end=mid;
                }else {
                    //target不在数组前半段的情况下mid为起点
                    start=mid;
                }
                //若数组前半段不是有序数列
            }else {
                //判断target是否在数组后半段
                if(target<=array[end] && array[mid]<=target){
                    start=mid;
                }else {
                    //target不在数组后半段的情况下mid为终点
                    end=mid;
                }
            }
        }

            if(array[start]==target){
                return start;
            }

            if(array[end]==target){
                return end;
            }


        return cursor;
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
     * 进阶:
     *
     * 这是 搜索旋转排序数组 的延伸题目，本题中的 nums  可能包含重复元素。
     * 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param array     指定数组
     * @param target    目标值
     * @return
     */
    public static boolean SearchInRotatedSortedArray2(int[] array,int target){

        if (array == null || array.length == 0) {
            return false;
        }

        int start=0;
        int end=array.length-1;


        while (start<=end){
            //定义数组中间位置
            int mid=start+(end-start)/2;
            if(array[mid]==target || array[start]==target || array[end]==target){
                return true;
            }

            //假设start和mid位置的数字存在重复，则过滤掉start位置的数字重新走while循环
            if(array[start]==array[mid]){
                start++;
                continue;
            }

            //判断数组前半段是否是有序的
            if(array[mid]>array[start]){
                //判断target是否在数组前半段
                if(target>=array[start]&&target<=array[mid]){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                //判断target是否在数组后半段
                if(target>=array[mid]&&target<=array[end]){
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

        if(array==null||array.length==0){
            return -1;
        }

        int start=0;
        int end=array.length-1;

        while (start+1<end){
            int mid=start+(end-start)/2;
            //若后半段有序，且中间数小于数组尾数，则尾数为中间数
            if(array[mid]<array[end]){
                end=mid;
            }else {
                //否则首数为中间数
                start=mid;
            }
        }

        return Math.min(array[start],array[end]);
    }

}
