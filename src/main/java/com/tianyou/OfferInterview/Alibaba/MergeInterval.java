package com.tianyou.OfferInterview.Alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例 2:
     *
     * 输入: intervals = [[1,4],[4,5]]
     * 输出: [[1,5]]
     * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-intervals
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> returnvalue=new ArrayList<>();
        if(intervals==null||intervals.length==0||intervals.length==1){
            return intervals;
        }

        //将数组按左端点升序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        for(int i=0;i<intervals.length;i++){
            if(returnvalue.size()==0||intervals[i][0]>returnvalue.get(returnvalue.size()-1)[1]){
                returnvalue.add(intervals[i]);
            }else {
                returnvalue.get(returnvalue.size()-1)[1]=intervals[i][1];
            }
        }

        return returnvalue.toArray(new int[returnvalue.size()][]);
    }
}
