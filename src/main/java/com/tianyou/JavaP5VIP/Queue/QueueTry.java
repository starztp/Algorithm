package com.tianyou.JavaP5VIP.Queue;

import java.util.Queue;
import java.util.Stack;

public class QueueTry {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public QueueTry(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    /**
     * 用两个栈实现队列的add方法
     * @param element
     */
    public void add(int element){
        stack1.push(element);
    }

    /**
     * 用两个栈实现队列的Poll方法
     * @return
     */
    public int poll(){
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    /**
     * 用凉个队列实现栈的push方法
     * @param element
     */
    public void push(int element){
        queue1.add(element);
        queue2.add(queue1.peek());
        queue1.remove();
    }

    /**
     * 两个队列实现栈的pop方法
     * @return
     */
    public int pop(){
        if(queue2.isEmpty()){
            return -1;
        }
        return queue2.poll();
    }
}
