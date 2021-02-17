package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    //maximum number of elements in stack
    private final int MAX_CAPACITY;
    int top;
    //to store the elements of stack.
    private int[] arr;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        //create an array
        arr = new int[MAX_CAPACITY];
        top = 0;

    }


    @Override
    public void push(int element) {
        if (top != MAX_CAPACITY){ // MAX_CAPACITY -1  for top = -1.
            //top++; in case of -1.
            arr[top] = element;
            top++;
        }
        else{
            System.out.println("Stack OverFlow");
        }

    }

    @Override
    public int pop() {
        int response = 0; // considering invalid data
        if (!isEmpty()){
            top--;
            response = arr[top];

        }
        else{
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()){
            response = arr[top -1];
        }
        else{
            System.out.println("Stack isEmpty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    public void traverse(){
        for (int i = 0; i < top ; i++) {
            System.out.print(arr[i]+ ", ");

        }

    }
    public boolean search(int searchElement){
        boolean response = false;
        for (int i = 0; i <top ; i++) {
            if (arr[i] == searchElement);
            {
                response = true;
                break;

            }

        }
        return response;
    }
}
