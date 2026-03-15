public class LinkedList1 {
    public static class Node {
    int data;
    Node next;
    public Node(int data) { 
        this.data = data;
        this.next = null;
        
    }
}

public  static Node head;
public static Node tail;
public static int size;
public void print() {
    if(head == null) {
        System.out.println("Linked List is empty");
        return;
    }

    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ->");
        temp = temp.next;
    }
    System.out.println("null");
}

public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

public void add(int index, int data) {
    Node newNode = new Node(data);
    size++;
    if (index == 0) {
        addFirst(data);
        return;
    }
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
public void removeFirst() {
    if (size == 0) {
        System.out.println("Linked List is empty");
        return;
    } else if (size == 1) {
        head = tail = null;
        size = 0;
        return;
    }
    head = head.next;
    size--;
}
public void removeLast() {
    if (size == 0) {
        System.out.println("Linked List is empty");
        return;
    } else if (size == 1) {
        head = tail = null;
        size = 0;
        return;
    }
    Node temp = head;
    for (int i = 0; i < size - 2; i++) {
        temp = temp.next;
    }
    temp.next = null;
    tail = temp;
    size--;
}

 
public static void main(String[] args) {
    LinkedList1 l1 = new LinkedList1();
   l1.addFirst(2);
   l1.addFirst(1);
   l1.addLast(3);
   l1.addLast(4);
   l1.print();


}
}
