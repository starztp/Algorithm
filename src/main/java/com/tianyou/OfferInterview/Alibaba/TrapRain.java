package com.tianyou.OfferInterview.Alibaba;

public class TrapRain {

    /**
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     *
     *  
     *
     * 示例 1：
     *
     *
     *
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
     * 示例 2：
     *
     * 输入：height = [4,2,0,3,2,5]
     * 输出：9
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/trapping-rain-water
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        int left=0;
        int right=height.length-1;
        //定义左侧最高高度
        int leftmax=0;
        //定义右侧最高高度
        int rightmax=0;
        int ans=0;
        while (left<right){
            //如果左边比右边低，积水的方向就是从左往右
            if(height[left]<height[right]){
                //定义左侧最高的位置
                if(height[left]>leftmax){
                    leftmax=height[left];
                }else {
                    //左侧最高位置减去当前左侧位置高度就是左侧当前位置的积水
                    ans+=leftmax-height[left];
                }
                left++;
            }else {
                //定义右侧最高位置
                if(height[right]>rightmax){
                    rightmax=height[right];
                }else {
                    //右侧最高位置减去当前右侧位置高度就是右侧当前位置的积水
                    ans+=rightmax-height[right];
                }
                right--;
            }

        }
        return ans;
    }
}
