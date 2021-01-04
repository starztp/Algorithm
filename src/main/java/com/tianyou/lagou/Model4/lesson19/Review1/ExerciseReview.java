package com.tianyou.lagou.Model4.lesson19.Review1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseReview {

    /**
     * 判断数组中所有的数字是否只出现一次。给定一个个数字 arr，判断数组 arr 中是否所有的数字都只出现过一次。约束时间复杂度为 O(n)。例如，arr = {1, 2, 3}，输出 YES。又如，arr = {1, 2, 1}，输出 NO
     * @param array
     * @return
     */
    public static boolean isUnique(int[] array){
        if(array.length==0||array==null){
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                return false;
            }
            map.put(array[i],1);
        }
        return true;
    }

    /**
     *  假设在一个数组中，有一个数字出现的次数超过数组长度的一半，现在要求你找出这个数字。
     *
     * 你可以假设一定存在这个出现次数超过数组长度的一半的数字，即不用考虑输入不合法的情况。要求时间复杂度是 O(n)，空间复杂度是 O(1)。例如，输入 a = {1,2,1,1,2,4,1,5,1}，输出 1。
     * 这是无视空间复杂度的做法
     * @param array
     * @return
     */
    public int getoverhalflength(int[] array){
        if(array.length==0||array==null){
            return -1;
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int count=map.get(array[i]);
            if(map.containsKey(array[i])){
                map.put(array[i],count+1);
            }else {
                map.put(array[i],1);
            }
            if(count>array.length/2){
                return array[i];
            }
        }
        return -1;
    }

    /**
     * 在一个方格棋盘里，左上角是起点，右下角是终点。每次只能向右或向下，移向相邻的格子。同时，棋盘中有若干个格子是陷阱，不可经过，必须绕开行走。
     *
     * 要求用动态规划的方法，求出从起点到终点总共有多少种不同的路径。例如，输入二维矩阵 m 代表棋盘，其中，1 表示格子可达，-1 表示陷阱。输出可行的路径数量为 2。
     * @param m
     * @param i
     * @param j
     * @return
     */
    public static int getpath(int[][] m,int i,int j){
        if(m[i][j]==-1){
            return 0;
        }

        if(i>0&&j>0){
            return getpath(m,i-1,j)+getpath(m,i,j-1);
        }

        if(i>0&&j==0){
            return 1;
        }

        if(i==0&&j<0){
            return 1;
        }

        return 1;
    }
}
