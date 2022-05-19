package aula6;

public class LinkedQueue implements Queue{
    private class Node {
        public int data;
        public Node next;
    }

    private Node base = null;
    private Node top = null;

    @Override
    public void add(int element) {
        var newNode = new Node();
        newNode.data = element;
        if(base == null) {
            base = newNode;
            top = newNode;
        } else {
            top.next = newNode;
            top = top.next;
        }
    }

    @Override
    public int remove() {
        if(isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        var data = base.data;
        base = base.next;
        return data;
    }

    @Override
    public void clear() {
        base = null;
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null && base == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}