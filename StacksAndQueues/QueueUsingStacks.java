package StacksAndQueues;
import java.util.*;
class QueueUsingStacks {

    private static Stack<Integer> oldstack;
    private static Stack<Integer> newstack;

    public QueueUsingStacks() {

        oldstack = new Stack<Integer>();
        newstack = new Stack<Integer>();

    }

    public void push(int x) {

        newstack.push(x);

    }

    public int pop() {
        shiftstack();
        return oldstack.pop();

    }

    public int peek() {
        shiftstack();
        return oldstack.peek();

    }

    public boolean empty() {
        if((newstack.isEmpty()) && (oldstack.isEmpty())){
            return true;
        }
        return false;

    }

    public void shiftstack(){

        if(oldstack.isEmpty()){
            while(!newstack.isEmpty()){
                oldstack.push(newstack.pop());
            }
        }

    }

    public static void main(String[] args){
          QueueUsingStacks obj = new QueueUsingStacks();
          obj.push(1);
          obj.push(2);
          obj.push(3);
          int param_2 = obj.pop();
          int param_3 = obj.peek();
          boolean param_4 = obj.empty();


    }
}


