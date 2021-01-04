package com.tianyou.JavaP5VIP.DynamicProgramming;

/**
 * 爬楼梯
 */
public class ClimbStairs {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/climbing-stairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param n 表示台阶数量
     * @return
     */
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        //定义楼梯数组
        int[] stairs=new int[n];
        //第1阶和第2阶默认都是1和2
        stairs[0]=1;
        stairs[1]=2;
        //从第3阶楼梯开始计算
        for(int i=2;i<stairs.length;i++){
            //n=(n-1)+(n-2)
            stairs[i]=stairs[i-1]+stairs[i-2];
        }
        return stairs[n-1];
    }

    /**
     * 用斐波那切数列做，只需要计算n-1和n-2就行了，无需计算其他数据
     * @param n
     * @return
     */
    public int climbStairs1(int n) {
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=first+second;
            //n-2和n-1各自往前挪一位
            first=second;
            second=third;
        }
        return second;
    }

}
