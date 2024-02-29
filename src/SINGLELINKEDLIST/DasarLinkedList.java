package SingleLInkedList;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
    
}

public class DasarLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);//buat node baru bernama node1
        Node node2 = new Node(20);//buat node baru bernama node2
        Node node3 = new Node(30);//buat node baru bernama node3
        Node node4 = new Node(40);//buat node baru bernama node4
        
        node1.next = node2;//node1 terhubung dengan node2
        node2.next = node3;////node2 terhubung dengan node3
        node3.next = node4;////node3 terhubung dengan node4
        
        System.out.println(node4.next);//null
        System.out.println(node1.next.data);//menampilkan data pada node2
        System.out.println(node1.next.next.data);//menampilkan data pada node3
        
         
        
        
        
    }
}
