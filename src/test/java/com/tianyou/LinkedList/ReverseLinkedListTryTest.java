package com.tianyou.LinkedList;

import com.tianyou.LinkedList.ReverseLinkedList.ReverseLinkedListTry;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedListTryTest {

    @Test
    public void TestReverseLinkedListTry(){
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("linkedList:"+linkedList);

        ReverseLinkedListTry ReverseLinkedListTry=new ReverseLinkedListTry();
        LinkedList ReverseLinkedList=ReverseLinkedListTry.ReverseLinkedList(linkedList);
        System.out.println("ReverseLinkedList:"+ReverseLinkedList);
    }

}
