package com.tianyou.Tree;

import org.junit.Test;

public class TreeTest {

    private BinaryTreeSerializeAndDeSerialize treeSerializeAndDeSerialize=new BinaryTreeSerializeAndDeSerialize();

    @Test
    public void TestdeserializeTree(){
        String data="[1,2,3,#,#,4,5]";
        String result=treeSerializeAndDeSerialize.deserialize(data).toString();
        System.out.println(result);
    }
}
