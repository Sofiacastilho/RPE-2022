package trabalhoLista;

import java.util.Objects;

public class ListaDuplamenteEncadeada<T> {

    private No<T> base;
    private No<T> top;
    private int size;

    public ListaDuplamenteEncadeada(){
        this.base = null;
        this.top = null;
        this.size = 0;
    }

    //Adiciona ao FINAL da lista
    public void add(T elemento){
        var no = new No<>(elemento);

        if (isEmpty()){
            base = no;
        } else {
            no.setNoAnterior(top);
            top.setNoProximo(no);
        }
        top = no;
        size = size + 1;
    }

    public void add (int pos, T elemento) {
        Objects.checkIndex(pos, getSize() + 1);

        //add no final
        if (pos == getSize()) {
            add(elemento);
            return;
        }

        var no = new No<>(elemento);
        var proximo = getNo(pos);
        var anterior = proximo.getNoAnterior();
        no.setNoAnterior(anterior);
        no.setNoProximo(proximo);

        if (anterior == null) {
            base = no;
        } else {
            anterior.setNoProximo(no);
        }

        proximo.setNoAnterior(no);
        size = size + 1;
    }

    private T remove(No<T> no) {

        T dado = no.getData();
        var anterior = no.getNoAnterior();
        var proximo = no.getNoProximo();

        if (anterior == null) {
            base = proximo;
        } else {
            anterior.setNoProximo(proximo);
        }

        if (proximo == null) {
            top = anterior;
        } else {
            proximo.setNoAnterior( anterior);
        }

        size = size - 1;
        return dado;

    }


    public T remove(int pos){
        return remove(getNo(pos));
    }


    private No<T> getNo(int pos){
        Objects.checkIndex(pos,size);
        int meio = size/2;

        if (pos <= meio){ //do meio para primeira pos
            No<T> atual = base;
            for (int i = 0; i< pos; i++){
                atual = atual.getNoProximo();
            }
            return atual;
        }

         //do meio para ultima pos
        var atual = top;
        for (int i = size-1; i != pos; i--){
            atual = atual.getNoAnterior();
        }
        return atual;

    }

    public T get(int pos){
        return this.getNo(pos).getData();
    }

    public  void set(int pos, T elemento){
        getNo(pos).setData(elemento);
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clean(){
        base = top = null;
        size = 0;
    }


    @Override
    public String toString() {
        StringBuilder strRetorno = new StringBuilder();
        No<T> noAuxiliar = base;
        for(int i = 0; i< getSize(); i++){
            strRetorno.append("[").append(noAuxiliar.getData()).append("]<-->");
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno.append("null");
        return strRetorno.toString();
    }
}