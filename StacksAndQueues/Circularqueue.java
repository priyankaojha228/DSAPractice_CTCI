package StacksAndQueues;

public class Circularqueue {

    private int[] arr;
    private int head;
    private int tail;
    private int length;

    public Circularqueue(int k) {
        arr = new int[k];
        head=-1;
        tail=-1;
        length=k;

    }

    public boolean enQueue(int value) {

        if(isFull()){
            return false;
        }
        if(isEmpty()){
            head=0;

        }
        tail=(tail+1)%length;
        arr[tail]=value;
        return true;

    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(head==tail){
            head=-1;
            tail=-1;
            return true;

        }
        head = (head+1)%length;
        return true;

    }

    public int Front() {

        if(isEmpty()){
            return -1;
        }

        return arr[head];



    }

    public int Rear() {

        if(isEmpty()){
            return -1;
        }

        return arr[tail];

    }

    public boolean isEmpty() {

        return head==-1;

    }

    public boolean isFull() {

        return (tail+1)%length == head;

    }
}
