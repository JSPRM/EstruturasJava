public class LinkedListJava {
    NodeLink head;

    static class NodeLink {
        int value;
        NodeLink next;

        NodeLink(int d){
            value = d;
            next = null;
        }
    }

    public void print(){
        NodeLink n = head;
        while (n != null){
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}
