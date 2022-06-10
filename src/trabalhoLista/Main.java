package trabalhoLista;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<java.io.Serializable> lista = new ListaDuplamenteEncadeada<>();

        System.out.println(lista.isEmpty());

        lista.add("aaaa");
        lista.add("bbbb");
        lista.add("cccc");
        lista.add("dddd");

        lista.remove(2);
        System.out.println(lista);

        lista.add(2, "uuuu");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.clean();
        System.out.println(lista);




    }


}
