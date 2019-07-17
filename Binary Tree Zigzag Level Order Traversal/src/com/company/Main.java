package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        travel(root,res,0);
        return res;
    }
    private void travel(TreeNode node,List<List<Integer>>list,int level){
        if(node==null)return ;
        if(list.size()<=level){
            List<Integer> newLevel= new ArrayList<>();
            list.add(newLevel);
        }
        List<Integer> tmplist=list.get(level);
        if(level%2==0) tmplist.add(node.val);
        else tmplist.add(0,node.val);

        travel(node.left,list,level+1);
        travel(node.right,list,level+1);
    }
}
