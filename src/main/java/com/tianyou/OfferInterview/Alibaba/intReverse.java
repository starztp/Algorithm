package com.tianyou.OfferInterview.Alibaba;

import java.util.Arrays;
import java.util.Stack;

public class intReverse {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     *
     * 示例 1:
     *
     * 输入: 123
     * 输出: 321
     *  示例 2:
     *
     * 输入: -123
     * 输出: -321
     * 示例 3:
     *
     * 输入: 120
     * 输出: 21
     * 注意:
     *
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param x
     * @return
     */
    public int reverse(int x) {
        if(x>2147483647||x<-2147483648){
            return 0;
        }
        String valueofx=String.valueOf(x);
        String xstring="";
        String reversexstring="";

        if(valueofx.length()==1){
            return x;
        }

        if(x<0){
            xstring=valueofx.substring(1,String.valueOf(x).length());
        }else {
            xstring=valueofx;
        }

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<xstring.length();i++){
            stack.push(xstring.charAt(i));
        }

        while (!stack.isEmpty()){
            reversexstring+=stack.pop().toString();
        }

        if(reversexstring.charAt(0)=='0'){
            reversexstring=reversexstring.substring(1,reversexstring.length());
        }

        if(x<0){
            reversexstring="-"+reversexstring;
        }

        long result=Long.valueOf(reversexstring);
        if(result>2147483647||result<-2147483648){
            return 0;
        }

        return Integer.valueOf(reversexstring);
    }
}
