public class LinkedList {
    private Node head;

    LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        newNode.next = head;

        head = newNode;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}