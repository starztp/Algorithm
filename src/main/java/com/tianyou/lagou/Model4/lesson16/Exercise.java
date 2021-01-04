package com.tianyou.lagou.Model4.lesson16;

public class Exercise {

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
     * 求最大公共子串（动态规划）
     * 【题目】输入两个字符串，用动态规划的方法，求解出最大公共子串。
     *
     * 例如，输入 a = "13452439"， b = "123456"。由于字符串"345"同时在 a 和 b 中出现，且是同时出现在 a 和 b 中的最长的子串。因此输出"345"。
     * @param str
     * @param str1
     * @return
     */
    public String getMaxSubString(String str,String str1){

        String maxSubStrung="";
        int maxlength=0;

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    for(int m=i,n=j;m<str.length()&&n<str1.length();m++,n++){
                        if(str.charAt(m)!=str1.charAt(n)){
                            break;
                        }
                        if(m-i>=maxlength){
                            maxlength=m-i;
                            maxSubStrung=str.substring(i,m+1);
                        }
                    }
                }
            }
        }
        return maxSubStrung;
    }
}
