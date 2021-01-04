package com.tianyou.lagou.Model3.lesson13.Review1;

public class ExerciseReview {

    /**
     * 快速排序
     * @param array
     * @param start
     * @param end
     */
    public void quickSort(int[] array,int start,int end){

        if(start>=end){
            return;
        }

        int temp=array[start];
        int left=start;
        int right=end;

        while (left<=right){
            //直到找到比array[left]大的数字
            while (array[left]<temp){
                left++;
            }

            //直到找到比array[right]大的数字
            while (array[right]>temp){
                right--;
            }

            //因为最后一次是left>right,所以在left>right时，不做交换
            if(left<=right){
                int tem=array[left];
                array[left]=array[right];
                array[right]=tem;
                left++;
                right--;
            }
        }

        //排序左半边（因为此时right<left,所以end为right）
        quickSort(array,start,right);
        //排序右半边（因为此时left>right,所以start为left）
        quickSort(array,left,end);

}
    }
