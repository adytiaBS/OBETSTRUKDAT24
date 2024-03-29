package HASHTABLE;

class MyHash1 {

    int maxSize;
    int[] array;

    public MyHash1(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
    }

    public int hashFunction(int data) {
        return data % maxSize;
    }

    public void insert(int newData) {
        int index = hashFunction(newData);
        array[index] = newData;
    }

    public int remove(int data) {
        int result = 0;
        int index = hashFunction(data);
        result = array[index];
        array[index] = 0;
        return result;
    }

    public int find(int data) {
        int result = 0;
        int index = hashFunction(data);
        result = array[index];
        return result;
    }

    public void display(){
        for(int i=0; i<maxSize; i++){
            if(array[i]!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}

public class DasarHash1 {

    public static void main(String[] args) {
        MyHash1 my = new MyHash1(10);
        my.insert(10);
        my.insert(3);
        my.insert(5);
        
        my.remove(3);
        
        
        System.out.println(my.find(5));
        System.out.println(my.find(1));
        my.display();
    }
}
