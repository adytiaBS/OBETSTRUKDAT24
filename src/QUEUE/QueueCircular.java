package QUEUE;

class MyQueueCircular {

    int maxSize;
    int rear;//var menunjuk data paling belakang
    int front;//var menunjuk data paling belakang
    int[] data;
    int nItem;

    public MyQueueCircular(int maxSize) {
        this.maxSize = maxSize;
        rear = -1;
        front = 0;
        data = new int[maxSize];
        nItem = 0;
    }

    public void insert(int newData) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        data[++rear] = newData;
        nItem++;
    }

    public int remove() {
        int result = data[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItem--;
        return result;
    }

    public void display() {
        int i = front;//start dari front
        while (i != rear) {//looping selama i!= rear
            System.out.println(data[i]);
            if (i == maxSize - 1) {//jika i ujung maka ke indek awal
                i = -1;//di set -1 karena di bawah ada incement..
            }
            i++;
        }
        System.out.println(data[rear]);

    }

    public boolean isEmpty() {
        return nItem == 0;
    }

    public boolean isFull() {
        return nItem==maxSize;
    }

    public int peek() {
        return data[front];
    }

    public int getNitem() {
        return nItem;
    }

}

public class QueueCircular {

    public static void main(String[] args) {
        MyQueueCircular my = new MyQueueCircular(5);
        my.insert(10);
        my.insert(20);
        my.insert(30);
        my.insert(40);
        my.insert(50);
        my.remove();
        my.insert(60);//masuk index 0
        
        my.display();
    }
}
