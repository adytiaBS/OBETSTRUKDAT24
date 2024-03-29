//hash table with array of object
package HASHTABLE;

class Node {

    private int data;

    public Node(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}

class MyHash2 {

    int maxSize;
    Node[] array;

    public MyHash2(int maxSize) {
        this.maxSize = maxSize;
        this.array = new Node[maxSize];
    }

    public int hashFunction(int data) {
        return data % maxSize;
    }

    public void insert(int newData) {
        Node newNode = new Node(newData);
        int index = hashFunction(newData);
        array[index] = newNode;
    }

    public Node remove(int data) {
        Node result;
        int index = hashFunction(data);
        result = array[index];
        array[index] = null;
        return result;
    }

    public Node find(int data) {
        Node result = null;
        int index = hashFunction(data);
        return array[index];
    }

    public void display() {
        int i = 0;
        while (i<maxSize) {
            if(array[i]!=null)
                System.out.print(array[i].getData() + " ");
            i++;
        }
    }
}

public class DasarHash2 {

    public static void main(String[] args) {
        MyHash2 my = new MyHash2(10);
        my.insert(10);
        my.insert(2);
        my.insert(3);
        my.remove(10);
        
        System.out.println(my.find(2).getData());
        my.display();
    }
}
