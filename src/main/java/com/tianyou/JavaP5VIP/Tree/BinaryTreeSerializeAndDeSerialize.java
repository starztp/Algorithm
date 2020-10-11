package com.tianyou.JavaP5VIP.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树树的序列化与反序列化
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 *
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * 示例: 
 *
 * 你可以将以下二叉树：
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * 序列化为 "[1,2,3,null,null,4,5]"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BinaryTreeSerializeAndDeSerialize{

    // Encodes a tree to a single string.

    /**
     * 将二叉树序列化为字符串
     * @param root
     * @return
     */
    public String serialize(TreeNode root){
        if(root==null){
            return null;
        }

        //把树结构序列化为List结构
        List<TreeNode> treeNodeList=new ArrayList<>();
        //从根节点开始添加
        treeNodeList.add(root);
        //依次添加树的子节点至List<TreeNode>
        for(int i=0;i<treeNodeList.size();i++){
            if(treeNodeList.get(i)==null){
                continue;
            }
            //这里对left和right没有做!null判断是因为添加了null值之后我们可能就会遍历到下一个有值的节点了，需要这个null值来标识有值节点的位置
            //后面会把数组尾巴里的null值都去掉，因为不需要这些null值做节点的定位
            TreeNode left=treeNodeList.get(i).left;
            TreeNode right=treeNodeList.get(i).right;
            treeNodeList.add(left);
            treeNodeList.add(right);
        }

        //去除List<TreeNode>末尾的null值
        while (treeNodeList.get(treeNodeList.size() - 1) == null) {
            treeNodeList.remove(treeNodeList.size() - 1);
        }

        //这里之所以用StringBuilder而不把数据存到list里用List.toString是因为list.toString转化后数字前面会有空格，不方便后面的反序列化
        StringBuilder stringBuilder=new StringBuilder("[");
        //这里先添加第一个值是为了防止添加最后一个值时还要在后面添加逗号的情况
        stringBuilder.append(treeNodeList.get(0).val);

        //遍历List<TreeNode>结构，用里面的值顺序组装字符串实现序列化
        for(int i=1;i<treeNodeList.size();i++){
            if (treeNodeList.get(i) == null) {
                //空值用#替代
                stringBuilder.append(",#");
            } else {
                stringBuilder.append("," + treeNodeList.get(i).val);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.

    /**
     * 将字符串反序列化为二叉树
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        if(data==null||data.equals("[]")){
            return null;
        }

        //去掉字符串首尾的[]
        String value=data.substring(1,data.length()-1);
        //解析data为数组
        String[] string=value.split(",");
        //定义根节点
        TreeNode root=new TreeNode(Integer.parseInt(string[0]));
        List<TreeNode> treeNodeList=new ArrayList<>();
        //添加二叉树根节点到treeNodeList
        treeNodeList.add(root);
        boolean isLeft=true;
        int Index=0;

        //分别添加二叉树左右子树到treeNodeList
        for(int i=1;i<string.length;i++){
            if(!string[i].equals("#")){
                TreeNode treeNode=new TreeNode(Integer.parseInt(string[i].trim()));
                if(isLeft){
                    //给上个节点的左子树赋值
                    treeNodeList.get(Index).left=treeNode;
                }else {
                    //给上个节点的右子树赋值
                    treeNodeList.get(Index).right=treeNode;
                }
                treeNodeList.add(treeNode);
            }
            //因为要等左右子树都赋值完再取下一个，所以要判断!isLeft
            if(!isLeft){
                Index++;
            }
            //左右交替添加子节点
            isLeft=!isLeft;
        }
        return treeNodeList.get(0);
    }
}
