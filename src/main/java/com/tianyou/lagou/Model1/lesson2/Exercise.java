package com.tianyou.lagou.Model1.lesson2;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    /**
     * 练习题
     * 下面我们来看一道练习题。在下面这段代码中，如果要降低代码的执行时间，第 4 行需要做哪些改动呢？如果做出改动后，是否降低了时间复杂度呢？
     *
     * 复制
     * public void s2_2() {
     *     int count = 0;
     *     for (int i = 0; i <= (100 / 7); i++) {
     *         for (int j = 0; j <= (100 / 3); j++) {
     *             if ((100-i*7-j*3 >= 0)&&((100-i*7-j*3) % 2 == 0)) {
     *                 count += 1;
     *             }
     *         }
     *     }
     *     System.out.println(count);
     * }
     * 我们给出一些提示，第 4 行代码，j 需要遍历到 33。但很显然，随着 i 的变大，j 并不需要遍历到 33。例如，当 i 为 9 的时候，j 最大也只能取到 12。如果 j 大于 12，则 7*9 + 3*13 > 100。不过，别忘了，即使是这样，j 的取值范围也是与 n 线性相关的。哪怕是 O(n/2)，其实时间复杂度也并没有变小。
     */
    public void s2_2() {
        int count = 0;
        for (int i = 0; i <= (100 / 7); i++) {
            for (int j = 0; j <= (100-i*7)/ 3; j++) {
                if ((100-i*7-j*3 >= 0)&&((100-i*7-j*3) % 2 == 0)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

    /**
     * 查找数组中出现次数最多的元素
     * @param array
     * @return
     */
    public int maxTimeElementInArray(int[] array){
        Map<Integer,Integer> elementTimesMapping=new HashMap<>();
        //记录出现次数最多的元素
        int elementMax=-1;
        //记录出现次数最多的次数
        int count=0;
        //遍历数组，将数组中的元素与其出现次数保存在字典中
        for(int i=0;i<array.length;i++){
            if(elementTimesMapping.containsKey(array[i])){
                elementTimesMapping.put(array[i],elementTimesMapping.get(array[i])+1);
            }else {
                elementTimesMapping.put(array[i],1);
            }
        }

        //遍历字典，找出出现次数最多的元素
        for(int key:elementTimesMapping.keySet()){
            if(elementTimesMapping.get(key)>count){
                count=elementTimesMapping.get(key);
                elementMax=key;
            }
        }
        return elementMax;
    }
}


