package com.tianyou.lagou.Model3.lesson12.Review1;

public class ExerciseReview {

    /**
     * 在一个有序数组中，查找出第一个大于目标值的数字，假设一定存在。例如目标值为9，arr = { -1, 3, 3, 7, 10, 14, 14 }; 则返回 10。
     * @param array
     * @param target
     * @return
     */
    public int findfirstabovetarget(int[] array,int target){

        int start=0;
        int end=array.length-1;
        while (start+1<end){
            int mid=start+(end-start)/2;
            if(array[mid]==array[start]){
                start++;
                continue;
            }
            if(target>=array[start]&&target<=array[mid]){
                end=mid;
            }

            if(target>=array[mid]&&target<=array[end]){
                start=mid;
            }
        }
        return array[start+1];
    }
}
