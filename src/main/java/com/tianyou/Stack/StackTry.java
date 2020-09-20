package com.tianyou.Stack;

import java.util.Stack;

public class StackTry {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public boolean ValidParenthese(String s){
        if(s.isEmpty()|| s==null){
            return false;
        }
        Stack<Character> charstack=new Stack<>();
        for(char c:s.toCharArray()){
            //左括号进栈
            if(c=='('||c=='['||c=='{'){
                charstack.push(c);
            }

            if(c==')'){
                if(charstack.isEmpty()||charstack.pop()!='('){
                    return false;
                }
            }

            if(c==']'){
                if(charstack.isEmpty()||charstack.pop()!='['){
                    return false;
                }
            }

            if(c=='}'){
                if(charstack.isEmpty()||charstack.pop()!='{'){
                    return false;
                }
            }
        }
        return charstack.isEmpty();
    }
}
