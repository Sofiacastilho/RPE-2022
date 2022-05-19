package aula7;

public class StaticList {
    private int size = 0;
    private int[] data;

    public StaticList(int size) {
        this.data = new int[size];
    }

    public void clear(){
        for (int i = 0; i < data.length; i++){
            data[i] = ;
        }
        data = null;
    }

    public void add(int element) {
        add(element, size);
    }

    public void add(int element, int pos) {
        if(pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Not a valid position!");
        }

        if (isFull()) {
            throw new IllegalStateException("List is full!");
        }

        for (int i = data.length - 1; i >= pos; i--) {
            data[i + 1] = data[i];
        }

        data[pos] = element;
        size ++;
    }

    public int remove(int pos){
        if(isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        if(pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Not a valid position!");
        }

        var removedElement = data[pos];

        for (int i = pos; i < size - 1; i++){
            data[i] = data[i + 1];
        }

        size --;
        data[size] = 0;

        return removedElement;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public int find(int data){
        if(isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        for(int i = 0; i < size; i++){
            if (data[i] == data){
                return data[i];
            }
        }


        return -1;
    }

    @Override
    public String toString(){
        var data = "[" + this.data[0];
        for (int i = 0; i < this.getCapacity(); i++){
            data+=", " + this.data[i] ;
        }
        return data + "]";
    }
}
