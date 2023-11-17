package StacksAndQueues;

public class Stack {

    private static int[] arr;
    private static int capacity;
    private static int top;
    Stack(int size){
        arr = new int[size];
        capacity=size;
        top=-1;
    }
    private static void push(int x){
        if(isFull()){
            System.exit(1);
        }
        arr[++top] = x;
    }
    private static int pop(){
        if(isEmpty()){
            System.exit(1);
        }
        return arr[top--];
    }

    private static void printstack(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    private static boolean isFull(){
        return top==capacity-1;
    }
    private static boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args){

        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.pop();
        st.printstack();

    }
}
