package com.tianyou.lagou.Model2.lesson6;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {

    /**
     * 约瑟夫环
     * 我们来看一个关于用队列解决约瑟夫环问题。约瑟夫环是一个数学的应用问题，具体为，已知 n 个人（以编号 1，2，3...n 分别表示）围坐在一张圆桌周围。从编号为 k 的人开始报数，数到 m 的那个人出列；他的下一个人又从 1 开始报数，数到 m 的那个人又出列；依此规律重复下去，直到圆桌周围的人全部出列。这个问题的输入变量就是 n 和 m，即 n 个人和数到 m 的出列的人。输出的结果，就是 n 个人出列的顺序。
     * @param array
     * @param k
     * @param m
     * @return
     */
    public void Josephring(int[] array,int k,int m){
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<array.length;i++){
            ((LinkedList<Integer>) queue).add(i);
        }
        for(int i=0;i<k;i++){
            ((LinkedList<Integer>) queue).add(queue.poll());;
        }

        while (queue.size()>0){
            for(int i=0;i<m;i++){
                ((LinkedList<Integer>) queue).add(queue.poll());
            }
            queue.poll();
        }
    }
}
