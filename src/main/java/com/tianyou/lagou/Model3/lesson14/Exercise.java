package com.tianyou.lagou.Model3.lesson14;

public class Exercise {

    /**
     * A到G的最短路径
     * 例题答案
     * https://kaiwu.lagou.com/course/courseInfo.htm?courseId=185#/detail/pc?id=3352
     * @param matrix
     * @return
     */
    public int minPath(int[][] matrix){
        return process1(matrix, matrix[0].length-1);
    }

    public static int process1(int[][] matrix, int i) {
        // 到达A退出递归
        if (i == 0) {
            return 0;
        }
        // 状态转移
        else{
            int distance = 999;
            for(int j=0; j<i; j++){
                if(matrix[j][i]!=0){
                    int d_tmp = matrix[j][i] + process1(matrix, j);
                    if (d_tmp < distance){
                        distance = d_tmp;
                    }
                }
            }
            return distance;
        }
    }


    public String getMaxSubString(String str,String str1){
        if(str.isEmpty()||str==null||str1.isEmpty()||str1==null){
            return null;
        }

        return "";
    }
}
