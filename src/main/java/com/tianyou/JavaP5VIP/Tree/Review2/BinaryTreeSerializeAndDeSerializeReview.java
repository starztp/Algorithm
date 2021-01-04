package com.tianyou.JavaP5VIP.Tree.Review2;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSerializeAndDeSerializeReview {

    /**
     * 将二叉树序列化为字符串
     * @param root
     * @return
     */
    public String serialize(TreeNode root){
        if(root==null){
            return "[]";
        }

        List<TreeNode> treeNodelist=new ArrayList<>();
        treeNodelist.add(root);
        for(int i=0;i<treeNodelist.size();i++){
            TreeNode treeNode=treeNodelist.get(i);
            if(treeNode==null){
                continue;
            }
            TreeNode left=treeNode.left;
            TreeNode right=treeNode.right;
            treeNodelist.add(left);
            treeNodelist.add(right);
        }

        while (treeNodelist.get(treeNodelist.size()-1)==null){
            treeNodelist.remove(treeNodelist.size()-1);
        }

        StringBuffer buffer=new StringBuffer();
        buffer.append("[");
        buffer.append(treeNodelist.get(0).val);

        for(int i=1;i<treeNodelist.size();i++){
            if(treeNodelist.get(i)==null){
                buffer.append(",#");
                continue;
            }
            buffer.append(","+treeNodelist.get(i).val);
        }
        buffer.append("]");

        return buffer.toString();
    }

    /**
     * 将字符串反序列化为二叉树
     * @param data
     * @return
     */
    public TreeNode deserialize(String data){
        if(data==null||data.isEmpty()||data.equals("[]")){
            return null;
        }
        data=data.substring(1,data.length()-1);
        String[] val=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(val[0]));
        List<TreeNode> treeNodeList=new ArrayList<>();
        treeNodeList.add(root);
        int index=0;
        boolean isleft=true;
        for(int i=1;i<val.length;i++){
             if(isleft){
                 if(!val[i].equals("#")){
                     TreeNode left=new TreeNode(Integer.parseInt(val[i]));
                     treeNodeList.get(index).left=left;
                     treeNodeList.add(left);
                 }
             }else {
                 if(!val[i].equals("#")){
                     TreeNode right=new TreeNode(Integer.parseInt(val[i]));
                     treeNodeList.get(index).right=right;
                     treeNodeList.add(right);
                 }
             }

            if(!isleft){
                index++;
            }
            isleft=!isleft;
        }
        return treeNodeList.get(0);
    }
}
