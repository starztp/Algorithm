package com.tianyou.lagou.Model3.lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Exercise {

    /**
     * 在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。移动圆盘时受到以下限制:
     * (1) 每次只能移动一个盘子;
     * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
     * (3) 盘子只能叠在比它大的盘子上。
     *
     * 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
     *
     * 你需要原地修改栈。
     *
     * 示例1:
     *
     *  输入：A = [2, 1, 0], B = [], C = []
     *  输出：C = [2, 1, 0]
     * 示例2:
     *
     *  输入：A = [1, 0], B = [], C = []
     *  输出：C = [1, 0]
     * 提示:
     *
     * A中盘子的数目不大于14个。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/hanota-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param A
     * @param B
     * @param C
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlate(A.size(),A,B,C);
    }

    private void movePlate(int n,List<Integer> original,List<Integer> auxiliary,List<Integer> target){
        if (n== 1) {    // 只剩一个盘子时，直接移动即可
            target.add(original.remove(original.size() - 1));
            return;
        }

        movePlate(n-1,original, target, auxiliary);   // 将 size-1 个盘子，从 original 移动到 auxiliary
        target.add(original.remove(original.size() - 1));   // 将 第size个盘子，从 original 移动到 target
        movePlate(n-1,auxiliary, original, target);// 将 size-1 个盘子，从 auxiliary 移动到 target
    }

    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：1
     * 示例 2：
     *
     * 输入：n = 5
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param n
     * @return
     */
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }

        int[] fib=new int[n];
        Arrays.fill(fib,1);
        for(int i=2;i<n;i++){
            fib[i]=fib[i-2]+fib[i-1];
        }
        return fib[n-1];
    }
}
