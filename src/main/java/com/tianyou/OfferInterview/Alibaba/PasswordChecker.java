package com.tianyou.OfferInterview.Alibaba;

public class PasswordChecker {

    /**自己编写的函数已经符合题意，但是leetcode没通过
     * 一个强密码应满足以下所有条件：
     *
     * 由至少6个，至多20个字符组成。
     * 至少包含一个小写字母，一个大写字母，和一个数字。
     * 同一字符不能连续出现三次 (比如 "...aaa..." 是不允许的, 但是 "...aa...a..." 是可以的)。
     * 编写函数 strongPasswordChecker(s)，s 代表输入字符串，如果 s 已经符合强密码条件，则返回0；否则返回要将 s 修改为满足强密码条件的字符串所需要进行修改的最小步数。
     *
     * 插入、删除、替换任一字符都算作一次修改。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/strong-password-checker
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param password
     * @return
     */
    public int strongPasswordChecker(String password) {
        int count=0;
        for(int i=1;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i-1)&&password.charAt(i)==password.charAt(i+1)){
                StringBuilder builder=new StringBuilder(password);
                password=builder.replace(i+1,i+2,"#").toString();
                count++;
            }
        }
        if(password.length()<6){
            count+=6-password.length();
        }

        if(password.length()>20){
            count+=password.length()-20;
        }
        return count;
    }
}
