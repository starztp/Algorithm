package com.tianyou.lagou.Model3.lesson14.Review1;

/**
 * Created by tianyou on 2020/11/3.
 */
public class ExerciseReview {

    /**
     * A到G的最短路径
     * https://kaiwu.lagou.com/course/courseInfo.htm?courseId=185#/detail/pc?id=3352
     * @param matrix
     * @return
     */
    public int minPath(int[][] matrix){
        return process(matrix,matrix[0].length-1);
    }

    public int process(int[][] m,int i){
        if(i==0){
            return 0;
        }else {
            int distance=999;
            for(int j=0;j<i;j++){
               if(m[j][i]!=0){
                   int temp=m[j][i]+process(m,j);
                   distance=Math.min(distance,temp);
               }
            }
            return distance;
        }
    }
}
