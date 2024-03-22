package QUEUE;
class MyQueue{
    int maxSize;
    int rear;//var menunjuk data paling belakang
    int front;//var menunjuk data paling belakang
    int[] data;
    int nItem;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        rear = -1;
        front = 0;
        data = new int[maxSize];
        nItem = 0;
    }
    public void insert(int newData){
        data[++rear] = newData;
        nItem++;
    }
    public int remove(){
        int result = data[front++];
        nItem--;
        return result;
    }
    public void display(){
        for(int i=front;i<=rear; i++){
            System.out.print(data[i]+" ");
        }
    }
    public boolean isEmpty(){
        return nItem==0;
    }
    public boolean isFull(){
        return nItem==maxSize;
    }
    public int peek(){
        return data[front];
    }
    public int getNitem(){
        return nItem;
    }
    
    
}
public class DasarQueue {
    public static void main(String[] args) {
        MyQueue my = new MyQueue(5);
        my.insert(10);
        my.insert(20);
        my.insert(30);
        my.insert(40);
        my.insert(50);
        my.remove();
        
        System.out.println("data paling depan : "+my.peek());
        
        my.display();
    }
}
