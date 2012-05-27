package list;

public class Node {

    private Object data;
    private Node next;

    Node(Object data) {
        this.data = data;
        next = null;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public Node getNext() {
        return next;
    }
}
