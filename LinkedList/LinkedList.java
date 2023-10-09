package LinkedList;
import java.util.*;
public class LinkedList {
    Node head;

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static class Result {

        int size;
        Node tail;

        // Constructor
        Result(Node tail, int size)
        {
            this.tail = tail;
            this.size = size;
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static LinkedList printList (LinkedList list){
        Node currnode = list.head;
        while(currnode!=null){
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
        return list;

    }

    public static void removeDups(LinkedList list){
        int[] arr = new int[100];
        Arrays.fill(arr,0);
        int i=0;
        Node curr  =list.head;
        Node prev = null;
        while(curr!=null){
            int val = curr.data;
            arr[val]+=1;
            if(arr[val]>1){
                prev.next = curr.next;
                curr.next = null;
            }
            prev=curr;
            curr=curr.next;
        }}
        public static void approachtwoRemoveDups(LinkedList list){
            Node current = list.head;
            while (current != null) {
                Node runner = current;
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }
                current = current.next;
            }
        }

    public static int returnKthToLast(LinkedList list, int k){
        Node curr = list.head;
        int len = 0;
        while(curr!=null){
            len+=1;
            curr=curr.next;
        }
        Node cur = list.head;
        int ele=0;
        int n = len-k;
        for(int i=0;i<len;i++){
            if(i==n){
                ele= cur.data;
            }
            cur=cur.next;
        }
        return ele;
    }

    public static boolean deleteMiddleNode(LinkedList list, Node k){
        if(k==null || k.next==null){
            return false;
        }
        Node next = k.next;
        k.data = next.data;
        k.next = next.next;
        return true;
    }

    public static Node Partition(LinkedList list, int x){
        Node curr = list.head;
        Node beforestart = null;
        Node beforeend = null;
        Node afterstart = null;
        Node afterend = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next=null;
            if(curr.data<x){
                if(beforestart==null){
                    beforestart=curr;
                    beforeend=beforestart;
                }
                else{
                    beforeend.next=curr;
                    beforeend=curr;
                }
            }
            else{
                if(afterstart==null){
                    afterstart=curr;
                    afterend=afterstart;
                }
                else{
                    afterend.next=curr;
                    afterend=curr;
                }
            }

            curr=next;
        }
        if(beforestart==null){
            return afterstart;
        }
        beforeend.next=afterstart;
        return beforestart;
    }

    public static Node Partition2(LinkedList list, int x){
        Node curr = list.head;
        Node head = curr;
        Node tail=curr;
        while(curr!=null){
            Node next = curr.next;
            if(curr.data<x){
                curr.next=head;
                head=curr;
            }
            else{
                tail.next=curr;
                tail=curr;
            }
            curr=next;

        }
        tail.next=null;
        return head;
    }

    public static void sumList(LinkedList l1, LinkedList l2){
        LinkedList l3 = new LinkedList();
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while(curr1!=null){
            int val = curr1.data;
            s1.append(Integer.toString(val));
            curr1=curr1.next;
        }
        while(curr2!=null){
            int val = curr2.data;
            s2.append(Integer.toString(val));
            curr2=curr2.next;
        }
        s1=s1.reverse();
        s2=s2.reverse();
        int a1 = Integer.parseInt(s1.toString());
        int a2 = Integer.parseInt(s2.toString());
        int sum = a1+a2;
        String sum2 = Integer.toString(sum);
        for(int i=0;i<sum2.length();i++){
            int a = sum%10;
            System.out.println(a);
            sum=sum/10;
            l3.insert(l3,a);
        }

    }

    public static boolean palindromeApproachOne(LinkedList list){
        Node curr = list.head;
        StringBuilder str = new StringBuilder();
        while(curr!=null){
            int data = curr.data;
            str.append(Integer.toString(data));
            curr=curr.next;
        }
        StringBuilder str1 = new StringBuilder(str.reverse());
        if(str.toString().equals(str1.toString())){
            return true;
        }
        return false;
    }

    public static Node findIntersection(LinkedList l1, LinkedList l2){
        if(l1==null || l2==null){
            return null;
        }
        Result res1 = getTailandSize(l1);
        Result res2 = getTailandSize(l2);
        if(res1.tail!=res2.tail){
            return null;
        }

        Node shorter = res1.size<res2.size ? l1.head:l2.head;
        Node longer = res1.size>res2.size ? l1.head:l2.head;

        longer = getKthNode(longer,Math.abs(res1.size-res2.size));
        while(shorter!=longer){
            shorter=shorter.next;
            longer=longer.next;
        }
        return longer;
    }

    public static Result getTailandSize(LinkedList list){
        int size =1;
        Node curr = list.head;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        return new Result(curr,size);
    }

    public static Node getKthNode(Node head, int k){
        Node curr = head;
        while(k>0 && curr!=null){
            curr=curr.next;
            k--;
        }
        return curr;
    }

    public static boolean detectLoop(LinkedList list){
        Node slow = list.head;
        Node fast = list.head;
        if(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }



    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Node node = new Node(3);
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,3);
        list.insert(list,2);
        list.insert(list,1);
        System.out.println(palindromeApproachOne(list));
        //list.printList(list);
    }

}
