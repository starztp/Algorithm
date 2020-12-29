package com.tianyou.OfferInterview.Alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

    /**
     * 暴力解法
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     *
     * 示例：
     *
     * 输入：n = 3
     * 输出：[
     *        "((()))",
     *        "(()())",
     *        "(())()",
     *        "()(())",
     *        "()()()"
     *      ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/generate-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<String>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    //回溯法
    public List<String> generateParenthesis1(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        //左括号小于n时添加左括号
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        //右括号小于左括号的数量添加右括号
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }


    public List<String> generateParenthesis2(int n){
        List<String> collection=new ArrayList<>();
        generate(collection,n,0,0,new StringBuffer());
        return collection;
    }

    private void generate(List<String> collection,int maxlength,int left,int right,StringBuffer buffer){

        if(buffer.length()==maxlength*2){
            collection.add(buffer.toString());
        }

        //左括号小于n时添加左括号
        if(left<maxlength){
            buffer.append("(");
            generate(collection,maxlength,left+1,right,buffer);
            //去掉当前位置的括号重新生成，直到递归至所有括号都被删除才结束
            buffer.deleteCharAt(buffer.length()-1);
        }

        //右括号小于左括号时添加右括号
        if(right<left){
            buffer.append(")");
            generate(collection,maxlength,left,right+1,buffer);
            //去掉当前位置的括号重新生成，直到递归至所有括号都被删除才结束
            buffer.deleteCharAt(buffer.length()-1);
        }
    }
}
