package com.tianyou.lagou.Model4.lesson17;

import java.util.*;

public class Exercise {

    /**
     *  给定一个字符串，逐个翻转字符串中的每个单词。例如，输入："This is a good example"，输出："example good a is This"。如果有多余的空格需要删除。
     * @param s
     * @return
     */
    public static String reverseWords(String s){
        Stack<String>stack=new Stack<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                //不为空时组装单词
                word+=s.charAt(i);
            }

            //为空或到字符串末尾时将单词压入栈
            if(s.charAt(i)==' '||i==s.length()-1){
                stack.push(word);
                stack.push(" ");
                //压栈后重置word变量
                word="";
            }
        }
        //字符串全部压栈后重置word变量
        word="";
        //出栈第一个空格
        stack.pop();
        while (!stack.isEmpty()){
            //出栈组装字符串
            word+=stack.pop().toString();
        }
        return word;
    }

    /**
     * 具体题目见：https://kaiwu.lagou.com/course/courseInfo.htm?courseId=185#/detail/pc?id=3355
     *  给定一棵树，按照层次顺序遍历并打印这棵树。例如，输入的树为：
     * 则打印 16、13、20、10、15、22、21、26。格外需要注意的是，这并不是前序遍历
     * @param root
     * @return
     */
    public static List<Integer> levelTraverse(TreeNode root){
        List<Integer> Treeval=new ArrayList<>();
        if(root==null){
            return Treeval;
        }
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        ((LinkedList<TreeNode>) treeNodeQueue).add(root);
        Treeval.add(root.val);
        while (!treeNodeQueue.isEmpty()){
            int size=treeNodeQueue.size();
            for(int i=0;i<size;i++){
                TreeNode treeNode=((LinkedList<TreeNode>) treeNodeQueue).pop();
                TreeNode left=treeNode.left;
                TreeNode right=treeNode.right;
                if(left!=null){
                    ((LinkedList<TreeNode>) treeNodeQueue).add(left);
                    Treeval.add(left.val);
                }

                if(right!=null){
                    ((LinkedList<TreeNode>) treeNodeQueue).add(right);
                    Treeval.add(right.val);
                }
            }
        }
        return Treeval;
    }

}
