package com.tianyou.JavaP5VIP.Heap;

import java.util.*;

public class HeapTry {

    public static void main(String[] args) {
        PriorityQueue heap = new PriorityQueue(3, new Comparator<Integer>(){
            /**
             * i2 - i1表示降序
             * i1-i2表示升序
             * @param i1
             * @param i2
             * @return
             */
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        });
        heap.add(4);
        heap.add(3);
        heap.add(6);
        heap.add(1);
        heap.add(9);
        //System.out.println(heap.peek());
        System.out.println(heap.poll());
        System.out.println(heap.peek());
    }


    /**
     * 求指定数组前k个最大值
     * @param nums  指定数组
     * @param k
     * @return
     */
    public int[] topK(int[] nums,int k){
        //先定义一个降序堆
        PriorityQueue heap = new PriorityQueue(3, new Comparator<Integer>(){
            /**
             * i2 - i1表示降序
             * i1-i2表示升序
             * @param i1
             * @param i2
             * @return
             */
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });

        //把数组元素添加到堆里
        for(int i:nums){
            heap.add(i);
        }

        //从大到小降序添加到List里
        List<Integer> topKList=new ArrayList<>();
        for(int i=1;i<=k;i++){
            topKList.add((Integer) heap.poll());
        }

        //list转数组
        int[] topK=topKList.stream().mapToInt(Integer::valueOf).toArray();
        return topK;
    }

}
