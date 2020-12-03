package com.tianyou.OfferInterview.Alibaba;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     *这种做法无法处理类似ccc的回文串
     * 示例 1：
     *
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     * 示例 2：
     *
     * 输入: "cbbd"
     * 输出: "bb"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if(s.isEmpty()||s==null){
            return null;
        }

        if(s.length()==1){
            return s;
        }

        char[] val=s.toCharArray();
        int length=0;
        String maxSubString="";
        int left=0;
        int right=s.length()-1;
        int mid=left+(right-left)/2;
        int index=0;
        while (index<mid&&index<s.length()-mid){
            if(val[mid+index]==val[mid-index]){
                index++;
                length++;
            }
        }

        if(length==0){
            maxSubString=s.substring(0,1);
        }
        return maxSubString;
    }

    public String longestPalindrome2(String s){
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            //针对字符个数为偶数时才需要+1
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            //如果以当前字符为中心扩展的回文长度大于之前的回文串长度，则重新定义回文串的起始和结束字符下标
            if (len > end - start) {
                //这里先做len-1而不是len/2-1是因为len/2-1的结果可能是负数
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    //求以当前字符串为中心扩展的回文串的长度
    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        //因为最后一次计算会出现--left<0或者++right>s.length的情况，所以要-1
        return right - left - 1;
    }


    /**
     * 自己手写版本
     * @param s
     * @return
     */
    public String longestPalindrome3(String s){
        if (s == null || s.isEmpty()) {
            return "";
        }

        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len=getPalindromelength(s,i,i);
            int len1=getPalindromelength(s,i,i+1);
            len=Math.max(len,len1);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }


    public int getPalindromelength(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            --left;
            ++right;
        }
        return right-left-1;
    }

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 示例 1:
     *
     * 输入: 121
     * 输出: true
     * 示例 2:
     *
     * 输入: -121
     * 输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3:
     *
     * 输入: 10
     * 输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/palindrome-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String xstring=String.valueOf(x);
        char[] xchar=xstring.toCharArray();
        int mid=xchar.length/2-1;
        boolean oddresult=isisPalindromenumber(xchar,mid,mid);
        boolean evenresult=isisPalindromenumber(xchar,mid,mid+1);
        if(oddresult==false&&evenresult==false){
            return false;
        }
        return true;
    }

    private boolean isisPalindromenumber(char[] chars,int left,int right){
        if((left<0)||(right>=chars.length)){
            return false;
        }
        if(chars[left]!=chars[right]){
            return false;
        }
        boolean isodd=false;
        if(chars.length%2!=0){
            isodd=true;
        }

        int count=0;

        while ((left>=0&&right<=chars.length-1)&&(chars[left]==chars[right])){
            if(chars[left]!=chars[right]){
                return false;
            }
            left--;
            right++;
        }


        if(isodd==true){
            count=right-left+1;
        }else {
            count=right-left-1;
        }

        if(count==chars.length){
            return true;
        }


/**
 boolean isodd=false;
 if(left==right){
 isodd=true;
 }

 while ((left>=0&&right<=chars.length-1)&&(chars[left]==chars[right])){
 left--;
 right++;
 }

 if(isodd==false){
 if((left<0&&right==chars.length-1)&&(chars[left+1]!=chars[right])||(left==0&&right>chars.length&&(chars[left]!=chars[right-1]))){
 return false;
 }
 }else if(isodd==true){
 if((left<0&&right==chars.length-1)&&(chars[left+1]!=chars[right])||((left==0&&right>chars.length-1)&&(chars[left]!=chars[right-1]))){
 return false;
 }
 }
 **/

        return false;
    }

}
