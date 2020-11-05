package com.tianyou.lagou.Model4.lesson17.Review1;

import java.util.*;

/**
 * Created by tianyou on 2020/11/4.
 */
public class ExerciseReview {

    /**
     *  给定一个字符串，逐个翻转字符串中的每个单词。例如，输入："This is a good example"，输出："example good a is This"。如果有多余的空格需要删除。
     * @param s
     * @return
     */
    public static String reverseWords(String s){
        if(s.isEmpty()||s==null){
            return null;
        }
        List<String> str=new ArrayList<>();
        String[] val=s.split(" ");
        Stack<String> stack=new Stack<>();
        for(int i=0;i<val.length;i++){
            stack.push(val[i]);
        }

        while (!stack.isEmpty()){
            str.add(stack.pop());
        }

        String returnstr=str.toString();
        returnstr=returnstr.substring(1,returnstr.length()-1);
        returnstr=returnstr.replaceAll(","," ");

        return returnstr;
    }

    /**
     * 具体题目见：https://kaiwu.lagou.com/course/courseInfo.htm?courseId=185#/detail/pc?id=3355
     *  给定一棵树，按照层次顺序遍历并打印这棵树。例如，输入的树为：
     * 则打印 16、13、20、10、15、22、21、26。格外需要注意的是，这并不是前序遍历
     * @param root
     * @return
     */
    public static List<Integer> levelTraverse(TreeNode root){
        List<Integer> treenodeval=new ArrayList<>();
        if(root==null){
            return treenodeval;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        treenodeval.add(root.val);
        for(int i=0;i<queue.size();i++){
            TreeNode treeNode=queue.poll();
            if(treeNode==null){
                continue;
            }
            TreeNode left=treeNode.left;
            TreeNode right=treeNode.right;
            if(left!=null){
                queue.add(left);
                treenodeval.add(left.val);
            }

            if(right!=null){
                queue.add(right);
                treenodeval.add(right.val);
            }
        }
        return treenodeval;
    }


}
