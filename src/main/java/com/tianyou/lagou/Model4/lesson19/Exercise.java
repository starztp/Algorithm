package com.tianyou.lagou.Model4.lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {

    /**
     * 判断数组中所有的数字是否只出现一次。给定一个个数字 arr，判断数组 arr 中是否所有的数字都只出现过一次。约束时间复杂度为 O(n)。例如，arr = {1, 2, 3}，输出 YES。又如，arr = {1, 2, 1}，输出 NO
     * @param array
     * @return
     */
    public static boolean isUnique(int[] array){
        boolean result=false;
        if(array.length==0||array==null){
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],1);
        }
        if(map.size()<array.length){
            result=true;
        }
        return result;
    }


    /**
     *  假设在一个数组中，有一个数字出现的次数超过数组长度的一半，现在要求你找出这个数字。
     *
     * 你可以假设一定存在这个出现次数超过数组长度的一半的数字，即不用考虑输入不合法的情况。要求时间复杂度是 O(n)，空间复杂度是 O(1)。例如，输入 a = {1,2,1,1,2,4,1,5,1}，输出 1。
     * 这是无视空间复杂度的做法
     * @param array
     * @return
     */
    public List<Integer> getoverhalflength(int[] array){
        List<Integer> list=new ArrayList<>();
        if(array.length==0||array==null){
            return list;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int count=map.get(array[i]);
                map.put(array[i],count+1);
            }else {
                map.put(array[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>array.length/2){
                list.add(map.get(key));
            }
        }
        return list;
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
        //陷阱直接return 0
        if(m[i][j]==-1){
            return 0;
        }

        //格子不在第一行和第一列计算公式为V(m[i,j]) = V(m[i-1,j]) + V(m[i,j-1])
        if(i>0&&j>0){
            return getpath(m,i-1,j)+getpath(m,i,j-1);
        }

        //第一行直接递归调用，非1即0
        if(i==0&&j>0){
            return getpath(m,i,j-1);
        }

        //第一列直接递归调用，非1即0
        if(i>0&&j==0){
            return getpath(m,i-1,j);
        }

        //其他情况返回1
        return 1;
    }

    /**
     * 小明从小就喜欢数学，喜欢在笔记里记录很多表达式。他觉得现在的表达式写法很麻烦，为了提高运算符优先级，不得不添加很多括号。如果不小心漏了一个右括号的话，就差之毫厘，谬之千里了。
     *
     * 因此他改用前缀表达式，例如把 (2 + 3) * 4写成* + 2 3 4，这样就能避免使用括号了。这样的表达式虽然书写简单，但计算却不够直观。请你写一个程序帮他计算这些前缀表达式。
     *
     * 在这个题目中，输入就是前缀表达式，输出就是计算的结果。你可以假设除法为整除，即“5/3=1”。例如，输入字符串为 + 2 3，输出 5；输入字符串为 * + 2 2 3，输出为 12；输入字符串为 * 2 + 2 3，输出为 10。
     *
     * 我们给出一些提示。假设输入字符串为 * 2 + 2 3，即 2*(2+3)。第一个字符为运算符号 *，它将对两个数字进行乘法。如果后面紧接着的字符不全是数字字符，那就需要暂存下来，先计算后面的算式。一旦后面的计算完成，就需要接着从后往前去继续计算。
     *
     * 因为从后往前是一种逆序动作，我们能够很自然地想到可以用栈的数据结构进行存储。你可以尝试利用栈，去解决这个问题。
     * @param str
     * @return
     */
    public static String getexpression(String str){
        return null;
    }
}
