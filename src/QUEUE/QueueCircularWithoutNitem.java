package QUEUE;
class MyQueueCircularX {

    int maxSize;
    int rear;//var menunjuk data paling belakang
    int front;//var menunjuk data paling belakang
    int[] data;
    
    public MyQueueCircularX(int maxSize) {
        this.maxSize = maxSize;
        rear = -1;
        front = 0;
        data = new int[maxSize];
    }

    public void insert(int newData) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        data[++rear] = newData;
    }

    public int remove() {
        int result = data[front++];
        if (front == maxSize) {
            front = 0;
        }
        return result;
    }

    public void display() {
        int i = front;//start dari front
        while (i != rear) {//looping selama i!= rear
            System.out.print(data[i]+" ");
            if (i == maxSize - 1) {//jika i ujung maka ke indek awal
                i = -1;//di set -1 karena di bawah ada incement..
            }
            i++;
        }
        System.out.println(data[rear]);

    }

    public boolean isEmpty() {
        return front-1==rear || front+maxSize-1 == rear;
    //  kondisi belum circular || kondisi circular
    }

    public boolean isFull() {
        return rear-front==maxSize-1 || front-1==rear;
        //  kondisi belum circular || kondisi circular
    }

    public int peek() {
        return data[front];
    }

    

}

public class QueueCircularWithoutNitem {
    public static void main(String[] args) {
        MyQueueCircularX my = new MyQueueCircularX(5);
        my.insert(10);
        my.insert(20);
        my.insert(30);
        my.insert(40);
        my.insert(50);//penuh
        my.remove();//hapus pada index0
        my.insert(60);//disimpan pada index0
        
        System.out.println(my.front+" "+my.rear);
        System.out.println(my.isFull());
        my.display();
    }
}
