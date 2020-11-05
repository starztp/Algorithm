package com.tianyou.lagou.Model4.lesson16.Review1;

/**
 * Created by tianyou on 2020/11/3.
 */
public class ExerciseReview {

    /**
     * 斐波那契数列是：0，1，1，2，3，5，8，13，21，34，55，89，144……。你会发现，这个数列中元素的性质是，某个数等于它前面两个数的和；也就是 a[n+2] = a[n+1] + a[n]。至于起始两个元素，则分别为 0 和 1。在这个数列中的数字，就被称为斐波那契数。
     *
     * 【题目】写一个函数，输入 x，输出斐波那契数列中第 x 位的元素。例如，输入 4，输出 2；输入 9，输出 21。要求：需要用递归的方式来实现。
     * @param index
     * @return
     */
    public int getFibonacciIndex(int index){
        if(index==0){
            return 0;
        }
        if(index==1){
            return 1;
        }

        return getFibonacciIndex(index-1)+getFibonacciIndex(index-2);
    }

    /**
     * 求最大公共子串
     * @param str
     * @param str1
     * @return
     */
    public String getMaxSubString(String str,String str1){

        char[] strchar=str.toCharArray();
        char[] str1char=str.toCharArray();
        int length=0;
        String maxsubString="";
        for(int i=0;i<strchar.length;i++){
            for(int j=0;j<str1char.length;j++){
                if(strchar[i]==str1char[j]){
                    for(int m=i,n=j;m<str.length()&&n<str1.length();m++,n++){
                        if(strchar[m]!=str1char[n]){
                            break;
                        }
                        if(m-i>length){
                            length=m-i;
                            maxsubString=str.substring(i,m+1);
                        }
                    }
                }
            }
        }
        return maxsubString;
    }
}
