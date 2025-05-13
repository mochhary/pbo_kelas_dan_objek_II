package tugas.tugastiga;

/**
 * 
 * @author Mochammad Hari Fitrian
 * @NIM : 2109106012
 * @version 1.0
 * @since 13-5-2025
 * @description Ini adalah program membuat objek menjadi sebuah tipe data bagi atribut objek lain
 * 
 */

 class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);

        n1.setNext(n2);

        System.out.println("Node 1: " + n1.getValue());
        System.out.println("Node 2 via Node 1: " + n1.getNext().getValue());
    }
}
