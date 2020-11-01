package com.tianyou.lagou.Model2.lesson8.Review1;

public class ExerciseReview {

    /**
     * 判断字符串中是否包含该子串
     * @param str   字符串
     * @param sub   子串
     * @return
     */
    public boolean contain(String str,String sub){

        char[] strchar=str.toCharArray();
        char[] subchar=sub.toCharArray();

        for(int i=0;i<str.length();i++){
            if(subchar[0]==strchar[i]){
                for(int m=i,n=0;n<subchar.length&&m<strchar.length;m++,n++){
                    if(strchar[m]!=subchar[n]){
                        break;
                    }
                    if(n==subchar.length-1){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * 获取2个字符串的最长公共子串
     * @param str
     * @param str1
     * @return
     */
    public String getMaxsubString(String str,String str1){

        char[] strchar=str.toCharArray();
        char[] str1char=str1.toCharArray();
        String maxsubString="";
        int maxlength=0;

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(strchar[i]==str1char[j]){
                    for(int m=i,n=j;m<str.length()&&n<str1.length();m++,n++){
                        if(strchar[m]!=str1char[n]){
                            break;
                        }
                        if(m-i>maxlength){
                            maxlength=m-i;
                            maxsubString=str.substring(i,m+1);
                        }
                    }
                }
            }
        }
        return maxsubString;
    }
}
