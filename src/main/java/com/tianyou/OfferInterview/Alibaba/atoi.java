package com.tianyou.OfferInterview.Alibaba;

public class atoi {

    /**
     * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
     *
     * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
     *
     * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
     * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
     * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
     * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
     *
     * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
     *
     * 提示：
     *
     * 本题中的空白字符只包括空格字符 ' ' 。
     * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        if(s==null||s.length()==0){
            return 0;
        }

        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        String num="";
        if(s.charAt(0)!='-'&&!Character.isDigit(s.charAt(0))&&s.charAt(0)!='+'){
            return 0;
        }else {
            num+=s.charAt(0);
        }


        for(int i=1;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
                long result=Long.valueOf(num);
                if(result<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }

                if(result>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }else {
                break;
            }
        }
        if(num.equals("-")||num.equals("+")){
            return 0;
        }

        return Integer.valueOf(num);
    }

    public int myAtoi1(String s){
        if(s==null||s.length()==0){
            return 0;
        }

        s=s.trim();
        int result=0;
        if(s.length()==0){
            return 0;
        }
        int index=0;
        //标记是否为负数
        boolean negative=false;
        if(s.charAt(index)=='-'){
            //第1个字符是-就标记为负数并且下标+1
            negative=true;
            index++;
        }else if(s.charAt(index)=='+'){
            //第1个字符是+下标就+1
            index++;
        }else if(!Character.isDigit(s.charAt(index))){
            //第一个字符非数字直接返回0
            return 0;
        }

        while (index<s.length()&&Character.isDigit(s.charAt(index))){
            int num=s.charAt(index)-'0';
            if(result>(Integer.MAX_VALUE-num)/10){
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            //上一位*10+index下标的值
            result=result*10+num;
            index++;
        }
        return negative?-result:result;
    }
}
