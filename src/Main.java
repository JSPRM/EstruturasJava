public class Main {

    public static void main(String[] args) {
        LinkedListJava llist = new LinkedListJava();

        llist.head = new LinkedListJava.NodeLink(1);
        LinkedListJava.NodeLink second = new LinkedListJava.NodeLink(2);
        LinkedListJava.NodeLink tercero = new LinkedListJava.NodeLink(3);

        llist.head.next = second;
        second.next = tercero;

        llist.print();
    }
}
