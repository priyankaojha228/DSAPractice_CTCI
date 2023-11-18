package StacksAndQueues;
import java.util.*;
import java.io.*;

class MinStack {
    private static int min;
    private static Stack<Integer> s2;
    private static int top;
    private static Stack<Integer> s1;
    public MinStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val<=min){
            min=val;
            s2.push(val);
        }
        s1.push(val);

    }

    public void pop() {
        int a = s1.peek();
        if(a==min){
            s2.pop();
        }
        if(!s2.isEmpty()){
            min=s2.peek();
        }
        s1.pop();

    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return s2.peek();
    }

    public static void main(String[] args){

  MinStack obj = new MinStack();
  obj.push(1);
  obj.push(1);
  obj.push(1);
  obj.pop();
  int param_3 = obj.top();
  int param_4 = obj.getMin();

    }
}

