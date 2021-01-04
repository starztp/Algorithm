package com.tianyou.lagou.Model2.lesson5;

import java.util.Stack;

public class Exercise {

    /**
     * 下面我们给出本课时的练习题。在上一课时中，我们的习题是，给定一个包含 n 个元素的链表，现在要求每 k 个节点一组进行翻转，打印翻转后的链表结果。其中，k 是一个正整数，且 n 可被 k 整除。
     *
     * 例如，链表为 1 -> 2 -> 3 -> 4 -> 5 -> 6，k = 3，则打印 321654。仍然是这道题，我们试试用栈来解决它吧。
     * @param linkList
     * @param k
     */
    public void rotateLinkList(LinkList linkList,int k){
        Stack<Integer> stack=new Stack<>();
        int count=1;
        while (linkList.next!=null&&count<=k){
            stack.push(linkList.val);
            linkList=linkList.next;
            count++;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 示例 1:
     *
     * 输入: "()"
     * 输出: true
     * 示例 2:
     *
     * 输入: "()[]{}"
     * 输出: true
     * 示例 3:
     *
     * 输入: "(]"
     * 输出: false
     * 示例 4:
     *
     * 输入: "([)]"
     * 输出: false
     * 示例 5:
     *
     * 输入: "{[]}"
     * 输出: true
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if(s==null||s.isEmpty()){
            return false;
        }

        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='{'||chars[i]=='['||chars[i]=='('){
                stack.push(chars[i]);
            }
            if(chars[i]=='}'&&(stack.isEmpty()||stack.pop()!='{')){
                return false;
            }

            if(chars[i]==')'&&(stack.isEmpty()||stack.pop()!='(')){
                return false;
            }

            if(chars[i]==']'&&(stack.isEmpty()||stack.pop()!='[')){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
