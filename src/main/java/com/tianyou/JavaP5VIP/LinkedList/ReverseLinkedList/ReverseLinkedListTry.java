package com.tianyou.JavaP5VIP.LinkedList.ReverseLinkedList;

import java.util.LinkedList;

/**
 * 定义一个函数，翻转一个链表
 * 比如原来是12345，现在要求反过来变成54321
 */
public class ReverseLinkedListTry {

    public LinkedList ReverseLinkedList(LinkedList linkedList){
        LinkedList resversedLinkedList=new LinkedList();
        for(int i=linkedList.size()-1;i>=0;i--){
            resversedLinkedList.add(linkedList.get(i));
        }
        return resversedLinkedList;
    }
}
