package aula7;

public class Main {
    public static void main(String[] args) {
        StaticList staticList = new StaticList(5);

        staticList.add(1);
        staticList.add(2);
        staticList.add(3);
        staticList.clear();

        staticList.toString();

    }
}
