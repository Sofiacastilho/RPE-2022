package trabalhoLabirintoFila;

public class FilaLinha {
    class No{
        int dado;
        No proximo;
    }

    No top = null;
    No base = null;

    public void add(int elemento) {
        No ultimoValorAdicionado = new No();
        ultimoValorAdicionado.dado = elemento;
        if (isEmpty()){
            base = ultimoValorAdicionado;
        }
        if (top != null){
            top.proximo = ultimoValorAdicionado;
        }
        top = ultimoValorAdicionado;
    }

    public int remove(){
        var baseAntiga = base;
        base = base.proximo;
        return baseAntiga.dado;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return base == null;
    }

    public void clear(){
        base = null;
    }

    @Override
    public String toString() {

        if ( base != null ) {
            var out = "[";
            var base = this.base;
            out += base.dado;
            base = base.proximo;
            while (base != null) {
                out += ", " + base.dado;
                base = base.proximo;
            }
            return out + "]";
        } else return "[]";
    }
}
