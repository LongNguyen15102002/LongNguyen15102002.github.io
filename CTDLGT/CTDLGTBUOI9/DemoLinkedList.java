package CTDLGTBUOI9;

public class DemoLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        printNode(n1);

        printNode(null);
    }

    public static void printNode(Node headNode) {
        Node temp = headNode;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if(temp != null){
                System.out.print(" -> ");
            } else {
                System.out.println();
            }
        }
    }
}
