package com.tianyou.lagou.Model3.lesson13;

public class Exercise {

    /**int[] array=new int[]{ 1, 0, 3, 4, 5, -6, 7, 8, 9, 10 };
     * 冒泡排序
     * @param array
     */
    public void bubblingSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                int temp=array[j];
                if(array[i]>array[j]){
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }


    /**
     * 快速排序
     * @param array
     * @param start
     * @param end
     */
    private void quickSort(int[] array,int start,int end){
        int temp=array[start];
        int left=start;
        int right=end;

        while (left<right){
            while (array[left]<temp){
                left++;
            }

            while (array[right]>temp){
                right--;
            }

            int tem=array[left];
            array[left]=array[right];
            array[right]=tem;
            left++;
            right--;
        }
        quickSort(array,start,left);
        quickSort(array,left,end);
    }
}
