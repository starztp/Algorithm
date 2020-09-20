package com.tianyou.Sort;

public class Sort {

    public void QuicklySort(int[] array){
        if(array.length<=1 || array==null){
            return;
        }

        quickSort(array,0,array.length-1);
    }

    /**
     *快速排序
     * @param array
     * @param start 数组起始排序位置
     * @param end   排序到数组哪个位置
     */
    private void quickSort(int[] array,int start,int end){

        if(start>=end){
            return;
        }

        //定义array[start]为比较参数
        int temp=array[start];
        int left=start;
        int right=end;

        while (left<=right){

            //把数组从左往右和temp进行比较，找到大于等于temp值的数组元素位置
            while (array[left]<temp){
                left++;
            }

            //把数组从右往左和temp进行比较，找到小于等于temp值的数组元素位置
            while (array[right]>temp){
                right--;
            }

            //将array[left]和array[right]交换位置
            if(left<=right){
                int temp1=array[left];
                //把前面找到的大于等于temp和小于等于temp的值互换位置
                array[left]=array[right];
                array[right]=temp1;
                //从下一位重新开始计数left和right
                left++;
                right--;
            }
        }

        //将数组左半边进行排序
        quickSort(array, start, right);

        //将数组右半边进行排序
        quickSort(array, left, end);
    }
}
