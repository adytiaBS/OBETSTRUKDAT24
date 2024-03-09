package DOUBLELINKEDLIST;

class MyDouble {
    Node first;
    Node last;

    public void reset() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {//jika linkedList masih kosong
            first = newNode;
            last = newNode;
        } else {//jika linkedlist sudah ada node yang masuk sebelumnya
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(first == null){//jika linkedList masih kosong
            first = newNode;
            last = newNode;
        }else{//jika linkedlist sudah ada node yang masuk sebelumnya
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }
    public void deleteFirst(){
        //asumsi linkedlist tidak kosong
        first = first.next;//first pindah ke kanan
        if(first == null){//jika first = null 
            last = null;//maka last juga ikut null
        }else{//jika tidak
            first.prev = null;//maka first.prev = null
        }
        
    }
    public void displayForward(){
        Node current = first;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void displayBackWard(){
        Node current = last;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.prev;
        }
    }
    public void deleteLast(){
        //
        last = last.prev;
        if(last == null){
            first = null;
        }else{
            last.next = null;
        }
        
    }
    public void insertAfter(int after, int data){
        Node newNode = new Node(data);
        Node current = first;
        while(current != null){
            if(current.data ==  after){
                newNode.next = current.next;
                newNode.prev = current;
                current.next = newNode;
                newNode.next.prev = newNode;
                              
                break;
            }
            current = current.next;
            
        }
    }
    public void deleteKey(int data){
        if(first.data == data){
            deleteFirst();
        }else if(last.data == data){
            deleteLast();
        }else{
            Node current = first.next;
            while(current != null){
                if(current.data == data){
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    break;
                }
                current = current.next;
            }
        }
    }
    
}

public class DemoDoubleLinkedList {

    public static void main(String[] args) {
            MyDouble my = new MyDouble();
            my.insertFirst(10);
            my.insertFirst(20);
            my.insertAfter(20, 25);
            
            /*my.deleteFirst();
            my.displayForward();
            System.out.println("");
            my.deleteFirst();
            my.deleteFirst();
            my.displayForward();*/
    }
}
