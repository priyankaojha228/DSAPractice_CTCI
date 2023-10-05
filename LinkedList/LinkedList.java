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



    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);
        list.insert(list,5);
       // removeDups(list);
        approachtwoRemoveDups(list);
        list.printList(list);
    }

}
