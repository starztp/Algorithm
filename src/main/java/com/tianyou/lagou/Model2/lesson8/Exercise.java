package com.tianyou.lagou.Model2.lesson8;

public class Exercise {

    /**
     * 判断字符串中是否包含该子串
     * @param str   字符串
     * @param sub   子串
     * @return
     */
    public boolean contain(String str,String sub){
       char[] strchar=str.toCharArray();
       char[] subchar=sub.toCharArray();
        int i=0;
        int j=0;
        //记录字符串与子串中多少个连续字符相等
        int k=0;

       for(;i<subchar.length;i++){
           if(k==subchar.length){
               break;
           }
           for(;j<strchar.length;j++){
               //若字符串与子串字符相等,则使字符串下个位置的字符与子串下个位置的字符进行对比，并记录k+1
               if(strchar[j]==subchar[i]){
                   j++;
                   //k+1
                   k++;
                   break;
               }else {
                   //若不相等则让子串从头和字符串当前位置开始匹配并重置k
                   i=0;
                   k=0;
               }
           }
       }
       //若k的值与子串的长度相等，则为true
       return k==subchar.length;
    }


    /**
     * 获取2个字符串的最长公共子串
     * 自己手写版本，用的另外一套逻辑来算,但是结果不符合预期
     * @param str
     * @param str1
     * @return
     */
    public String getMaxsubString(String str,String str1){
        if(str.equals(str1)){
            return str;
        }
        char[] strchar=str.toCharArray();
        char[] str1char=str1.toCharArray();

        //定义k用来计算连续匹配成功的字符数
        int k=0;
        //定义最长子串长度
        int maxlength=0;
        //定义最长子串
        String maxSubString=null;
        for(int i=0;i<strchar.length;i++){
            //若k等于任意字符串的长度，则最长公共字符串为str或str1
            if(k==str.length()||k==str1.length()){
                maxlength=Math.max(k,maxlength);
                maxSubString=str.substring(i-maxlength,maxlength);
                break;
            }
            for(int j=0;j<str1char.length;j++){
                //找到匹配的字符后k+1
                if(strchar[i]==str1char[j]){
                    k++;
                    //取k和上个maxlength的大值
                    maxlength=Math.max(k,maxlength);
                    //若maxlength被k更新，则重新计算maxSubString
                    if(maxlength==k&&k!=0){
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        System.out.println("k:"+k);
                        System.out.println("maxlength:"+maxlength);
                        maxSubString=str.substring(i-maxlength,maxlength+1);
                    }
                    break;
                }else {
                    //字符串不相等则重置k
                    k=0;
                }
                //取k和上个maxlength的大值
                maxlength=Math.max(k,maxlength);
                //若maxlength被k更新，则重新计算maxSubString
                if(maxlength==k&&k!=0){
                    System.out.println("i:"+i);
                    System.out.println("j:"+j);
                    System.out.println("k:"+k);
                    System.out.println("maxlength:"+maxlength);
                    maxSubString=str.substring(i-maxlength,i+1);
                }

            }
        }
        return maxSubString;
    }


    /**
     * 根据老师的例子自己手写的版本，运行成功，符合预期结果
     * @param str
     * @param str1
     * @return
     */
    public String getMaxsubString1(String str,String str1){
        if(str.equals(str1)){
            return str;
        }
        char[] strchar=str.toCharArray();
        char[] str1char=str1.toCharArray();
        int maxlength=0;
        String maxSubString="";
        for(int i=0;i<strchar.length;i++){
            for(int j=0;j<str1char.length;j++){
                //找到两个字符串中相等的字符后
                if(strchar[i]==str1char[j]){
                    for(int m=i,n=j;m<strchar.length&&n<str1char.length;m++,n++){
                        //若2个字符串在该字符后面的值不匹配，则break
                        if(strchar[m]!=str1char[n]){
                            break;
                        }
                        if(maxlength<m-i+1){
                            //maxlength取大值
                            //因为要包含strchar[i]==str1char[j]，所以要+1
                            maxlength=m-i+1;
                            //因为substring第二个参数取值是不包含，所以要+1
                            maxSubString=str.substring(i,m+1);
                        }
                    }
                }
            }
        }
        return maxSubString;
    }

    /**
     * 老师的样例
     * @param a
     * @param b
     * @return
     */
    public String getMaxsubString2(String a,String b){
        int max_len=0;
        String maxSubStr="";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++){
                if (a.charAt(i) == b.charAt(j)){
                    for (int m=i, n=j; m<a.length()&&n<b.length(); m++,n++) {
                        if (a.charAt(m) != b.charAt(n)){
                            break;
                        }
                        if (max_len < m-i+1){
                            max_len = m-i+1;
                            maxSubStr = a.substring(i, m+1);
                        }
                    }
                }
            }
        }
        return maxSubStr;
    }
}
