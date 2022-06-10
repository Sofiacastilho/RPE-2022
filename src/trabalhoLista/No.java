package trabalhoLista;

public class No<T> {

    private T data;
    private No<T> noProximo;
    private No<T> noAnterior;

    public No(T conteudo) {
        this.data = conteudo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No<T> noPrevio) {
        this.noAnterior = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + data +
                '}';
    }
}