package com.tianyou.lagou.Model2.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Exercise {


    /**
     * 练习题
     * 最后我们留一道课后练习题。给定一个含有 n 个元素的链表，现在要求每 k 个节点一组进行翻转，打印翻转后的链表结果。其中，k 是一个正整数，且可被 n 整除。
     *
     * 例如，链表为 1 -> 2 -> 3 -> 4 -> 5 -> 6，k = 3，则打印 321654。我们给出一些提示，这个问题需要使用到链表翻转的算法。
     * @param list
     * @param k
     * @return
     */
    public void rotateLinkList(LinkList list,int k){
        if(list==null){
           System.out.println("list为空");
        }

        if(list.next==null){
            System.out.println(list.val);
        }

        LinkList next=null;
        LinkList current=null;
        LinkList pre=null;
        List<Integer> valuelist=new ArrayList<>();
        while (list.next!=null){
            for(int i=1;i<k;i++){
                next=list.next;
                pre=next;
                list=list.next;
                next=list.next;
                valuelist.add(pre.val);
                valuelist.add(list.val);
                valuelist.add(next.val);
            }
        }
        System.out.println(valuelist.toString());

    }
}
