package Stacks;

public class StacksUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Size of the stack-->"+ s.size());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
class Stack{
    int arr[];
    int capacity = 10;
    int size = -1;

    Stack(){
        arr = new int[capacity];
    }
    public boolean isEmpty(){
        return size == -1;
    }
    public void push(int x){
         size++;
         arr[size] = x;
    }
    public int pop(){
        if(!isEmpty()){
            int val = arr[size];
            size--;
            return val;
        }
        return -1;
    }
    public int peek(){
        if(!isEmpty()){
            return arr[size];
        }
        return -1;
    }
    public int size(){
        return size+1;
    }

}
