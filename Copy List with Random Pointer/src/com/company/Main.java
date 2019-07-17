package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public Node copyRandomList(Node head) {

        //copy all the node
        Node node=head;
        Map<Node,Node> map=new HashMap<Node,Node>(){};
        while(node!=null){
            map.put(node,new Node(node.val));
            node=node.next;
        }
        node=head;
        While(node!=null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
            return map.get(head);
        }
    }

}
