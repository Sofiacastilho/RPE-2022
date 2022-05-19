package aula6;
//Interface para a fila
//Definição apenas de uma "assinatura" dos métodos
//A implementação de cada método é feita pelas classes que implementam a interface Queue
public interface Queue {
    void add(int element);
    int remove();
    void clear();
    boolean isEmpty();
    boolean isFull();
}