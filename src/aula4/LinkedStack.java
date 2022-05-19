package aula4;

public class LinkedStack implements Stack{
    private static class Node{
        public Node previous;
        public int data;
    }
    private Node top = null;

    @Override
    public void push(int element) {
        var newData = new Node();
        newData.data = element;
        newData.previous = top;
        top = newData;

    }

    @Override
    public int pop() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        var data = top.data;
        top = top.previous;
        return data;
    }


    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return false;

    }


}
