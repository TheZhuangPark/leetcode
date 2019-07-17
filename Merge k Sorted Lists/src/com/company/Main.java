package com.company;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListNode node1=new ListNode(1);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node4;
        node4.next=node5;

        ListNode node3=new ListNode(3);
        ListNode node4_=new ListNode(4);
        ListNode node1_=new ListNode(1);
        node1_.next=node3;
        node3.next=node4_;

        ListNode node2=new ListNode(2);
        ListNode node6=new ListNode(6);
        node2.next=node6;
        ListNode[] lists=new ListNode[3];
        lists[0]=node1;
        lists[1]=node1_;
        lists[2]=node2;

        ListNode result=mergeKLists(lists);
        printList(result);
    }



    public static ListNode mergeKLists(ListNode[] lists) {
       return partion(lists,0,lists.length-1);
    }
    public static ListNode partion(ListNode[] lists,int s,int e){
        if(s==e) return lists[s];
        if(s<e){
            int q=(s+e)/2;
            ListNode l1=partion(lists,s,q);
            ListNode l2=partion(lists,q+1,e);
            return merge(l1,l2);
        }else
            return null;
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next=merge(l1.next,l2);
            return l1;
        }else{
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }

    public static void printList(ListNode node){
        while(node!=null){
            System.out.print(node.val+"-");
            node=node.next;
        }
    }
}
