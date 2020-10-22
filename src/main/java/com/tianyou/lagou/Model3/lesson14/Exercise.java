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

    public int minPath2(int[][] matrix){
        return process2(matrix,matrix[0].length-1);
    }


    public static int process2(int[][] matrix,int i){
        if(i==0){
            return 0;
        }else {
            //默认1000
            int distance=1000;
            for(int j=0;j<i;j++){
                //因为没有第15行，所以用matrix[j][i]，而不是matrix[i][j],否则会数组越界
                if(matrix[j][i]!=0){
                    //先反向递归到A,再从A到G
                    int dstancetmp=matrix[j][i]+process2(matrix,j);
                    if(dstancetmp<distance){
                        distance=dstancetmp;
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
