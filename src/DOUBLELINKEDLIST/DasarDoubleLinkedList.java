package DOUBLELINKEDLIST;
class Node{
    int data;//untuk menyimpan nilai
    Node next;//untuk menunjuk node sebelah kanan
    Node prev;//untuk menunjuk node sebelah kiri
    public Node(int data) {//construktor untuk memberi nilai var data
        this.data = data;
        
    }
    
}
public class DasarDoubleLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);//membuat node baru bernama node1
        Node node2 = new Node(20);//membuat node baru bernama node2
        Node node3 = new Node(30);//membuat node baru bernama node3
        
        node1.next = node2;//node1.next tersambung ke node 2
        node2.prev = node1;//node1.prev tersambung ke node 1
        node2.next = node3;//node2.next tersambung ke node 3
        node3.prev = node2;//node3.next tersambung ke node 2
        
        Node current;
        Node first = node1;//node first menunjuk node1
        current = first;
        
        System.out.println(current.next.next.prev.data);//menampilkan data pada node 2
        
    }
}
