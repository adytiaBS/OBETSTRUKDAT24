package SingleLInkedList;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
    
}

public class DasarSingleLinkedList {
    public static void main(String[] args) {
        Node current;//node null
        Node node1 = new Node(10);//buat node baru bernama node1
        Node node2 = new Node(20);//buat node baru bernama node2
        Node node3 = new Node(30);//buat node baru bernama node3
        Node node4 = new Node(40);//buat node baru bernama node4
        
        node1.next = node2;//node1 terhubung dengan node2
        node2.next = node3;////node2 terhubung dengan node3
        node3.next = node4;////node3 terhubung dengan node4
        
        current = node1;//current berisi/menunjuk node1
        
        
        System.out.println(current.data);//menampilkan data node1
        System.out.println(current.next.data);//menampilkan data node2
        System.out.println(current.next.next.data);//menampilkan data node3
        
        
         
        
        
        
    }
}
