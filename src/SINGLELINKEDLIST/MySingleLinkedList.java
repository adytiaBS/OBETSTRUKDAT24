package SINGLELINKEDLIST;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
}

class LinkedList{
    Node first;//node untuk menunjuk node paling depan
    Node last;////node untuk menunjuk node paling belakang
    
    public void insertFisrt(int data){
        Node newNode = new Node(data);//buat node baru
        if(first == null){//jika masih kosong (belu ada node sama sekali)
            first = newNode;
            last = newNode;
        }else{//jika sudah ada data
            newNode.next = first;
            first = newNode;
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }
    public void display(){
      Node current = first;//current menunjuk first
      while(current != null){//perulangan sampai semua node
          System.out.print(current.data+" ");
          current = current.next;//i++
      }
    }
    
    public boolean find(int data){
        boolean hasil = false;
        Node current = first;
        while(current != null){//diulang selama current tidak sama dengan null
            if(current.data == data){
                hasil = true;//jika ada data yang sama maka hasil berubah true
                break;//hentikan perulangan
            }
                current = current.next;//i++
                
        }
           return hasil; 
    }
    
    public void deletFirst(){
        first = first.next;//first pindah ke next
    }
    public void delete(int data){
        Node current = first;
        Node before = first;//digunakan untuk node sebelumnya
        if(first.data == data){//jika data yang dihapus node depan
            first = first.next;
        }else{//jika yang dihapus bukan node depan
            current = current.next;
            while(current != null){
                if(current.data == data){
                    before.next = current.next;
                    break;
                }
                current = current.next;
                before = before.next;
            }
        }
    }
    
}

public class MySingleLinkedList {
    public static void main(String[] args) {
        LinkedList my = new LinkedList();
        my.insertLast(10);
        my.insertLast(20);
        my.insertFisrt(30);
        my.insertFisrt(50);
        my.insertLast(60);
        my.insertLast(80);
        
        my.delete(60);
        my.insertFisrt(100);
        my.display();
    }
}
