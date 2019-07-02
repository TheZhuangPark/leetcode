package com.company;
import com.sun.xml.internal.ws.api.message.Header;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode l1=new ListNode(9);
        ListNode l2=new ListNode(9);
//        ListNode l3=new ListNode(3);
        l1.next=l2;
//        l2.next=l3;

        ListNode r1=new ListNode(9);
        ListNode r2=new ListNode(9);
//        ListNode r3=new ListNode(4);
//        ListNode r4=new ListNode(3);
        r1.next=r2;
//        r2.next=r3;
//        r3.next=r4;

       // printListNode(l1);
       // printListNode(r1);

        ListNode result=addTwoNumbers(l1,r1);
        printListNode(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode Head=null;
        ListNode Tail=null;
        int carry=0;
        int t1=0,t2=0,t3=0;
        ListNode p1=l1;
        ListNode p2=l2;

        while(p1!=null||p2!=null||carry!=0){

            t1=0;
            t2=0;
            if(p1!=null){ t1=p1.val;}
            if(p2!=null){ t2=p2.val;}
            if(p1==null && p2!=null){
                Tail.next=p2;
                if(carry!=0) p2.val+=1;
                while(p2!=null){
                    if(p2.val>=10){
                        p2.val=0;
                        if(p2.next!=null){
                            p2.next.val+=1;
                        }else
                        {
                            ListNode tmp1= new ListNode(1);
                            p2.next=tmp1;
                        }
                    }
                    p2=p2.next;
                }

            //   printListNode(Head);
                return Head;
            }else if(p2==null && p1!=null ){
                Tail.next=p1;
                if(carry!=0) p1.val+=1;
                while(p1!=null) {
                    if (p1.val >= 10) {
                        p1.val = 0;
                        if (p1.next != null) {
                            p1.next.val += 1;
                        } else {
                            ListNode tmp2 = new ListNode(1);
                            p1.next = tmp2;
                        }
                    }
                    p1 = p1.next;
                }
            //    printListNode(Head);
                return Head;
            }

            if((t3=t1+t2)<10){
                if(Head==null){ Head=new ListNode(t3); Tail=Head;
                //printListNode(Head);
                }
                else{
                    ListNode tmp=new ListNode(t3+carry);
                    carry=0;
                    if(tmp.val>=10){
                        tmp.val-=10;
                        carry=1;
                    }
                    Tail.next=tmp;
                    Tail=tmp;
                  //  printListNode(Head);
                }
            }else{
                t3=t3-10;
                if(Head==null){ Head=new ListNode(t3); Tail=Head;
                    //printListNode(Head);
                }else {
                    ListNode tmp = new ListNode(t3+carry);
                    Tail.next = tmp;
                    Tail = tmp;
                    // printListNode(Head);
                }
                carry=1;
            }
           if(p1!=null) p1=p1.next;
           if(p2!=null) p2=p2.next;

            printListNode(Head);
        }
        return Head;
    }

    public static void printListNode(ListNode HEAD){
        ListNode tmp= HEAD;
        while(tmp!=null){
            System.out.print(tmp.val+"->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }
}







//
//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        int[] num=new int[]{2,7,11,5};
//        int[] re = twoSum(num,9);
//        System.out.println(re[0]+" "+re[1]);
//
//
//
//
//    }
//
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < numbers.length; i++) {
//            // System.out.println("t:"+target+"n["+i+"]:"+numbers[i]);
//
//            if (map.containsKey(target - numbers[i])) {
//                result[1] = i + 1;
//                result[0] = map.get(target - numbers[i]);
//                return result;
//            }
//
//            // System.out.println("put key:"+numbers[i]+"value:"+(i+1));
//            map.put(numbers[i], i + 1);
//        }
//        return result;
//    }
//
//
//}
