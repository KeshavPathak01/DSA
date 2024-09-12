package com.dsa;

public class stackarr {
    public static void main(String[] args) {
        stack mystack=new stack(10);
        mystack.push('A');
        mystack.push('B');
        mystack.push('7');
        mystack.push('8');
        mystack.printstack();
        System.out.println("pop: "+mystack.pop());
        mystack.printstack();
        System.out.println("size: "+mystack.size());

    }
    static class stack{
        char []stack;
        int top;
        int capacity;
        stack(int capacity){
            this.capacity=capacity;
            this.top=-1;
            this.stack=new char[capacity];
        }
        public void push(char element){
            if(top==capacity-1){
                System.out.println("Stack is full");
                return;
            }
            stack[++top]=element;
        }
        public char pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return ' ';
            }
            return stack[top--];
        }
        public char peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return ' ';
            }
            return stack[top];
        }
        public boolean isEmpty(){
            return top==-1;
        }
        public int size(){
            return top+1;
        }
        public void printstack(){
            System.out.print("stack: ");
            for(int i=0;i<top+1;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}
