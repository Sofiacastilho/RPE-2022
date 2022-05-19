package aula6;

public class Main {
    public static void main(String[] args) {

        //pegar main da prof de novo

        FilaEncadeada fila = new FilaEncadeada();


        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println(fila);

        fila.remove();

        System.out.println(fila);
        fila.remove();

        System.out.println(fila);

        fila.add(9);

        System.out.println(fila);

        fila.clear();
        System.out.println(fila);



    }
}