package com.tianyou.JavaP5VIP.Hash;

import java.util.HashMap;
import java.util.Map;

public class HashTry {

    /**
     * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringTry(String s) {
        if(s.length()==0||s==null){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }
        //保存每个字母以及其在数组中的最新的位置
        Map<Character,Integer> map=new HashMap<>();
        //记录不包含重复字符串的长度
        int length=1;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(i-map.get(s.charAt(i))+1>length){
                    //长度为当前位置减去之前的位置的值
                    length=i-map.get(s.charAt(i));
                }

                //更新该元素在数组中的位置
                map.put(s.charAt(i),i);
                if(count>length){
                    count=0;
                }
            }
            {
                map.put(s.charAt(i),i);
                count++;
            }
        }

        return Math.max(length,count);
    }


    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0;
        int length = 0;
        for(int i = 0; i< s.length(); i++) {
            //获取当前元素最新索引,如果没有则返回-1
            int j = dic.getOrDefault(s.charAt(i), -1);
            //更新当前元素最新索引
            dic.put(s.charAt(i), i);
            //i-j表示数组当前位置减去当前元素位置更新前一次的位置
            //获取字符串长度
            //如果当前字符之前没有出现过，length则为数组当前坐标+1，因为此时j=-1,i-j就可以看成i+1
            length = length < i - j ? length + 1 : i - j;
            //前一次和后一次的结果对比取大值
            res = Math.max(res, length);
        }
        return res;
    }


}
