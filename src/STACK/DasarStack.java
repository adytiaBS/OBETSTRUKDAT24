package STACK;
class MyStack{
    int size;//batas panjang array
    int top;//digunakan untuk data paling atas
    char[] data;//array

    public MyStack(int size) {
        this.size = size;
        data = new char[size];
        top = -1;//di set -1 jika stack kosong
    }
    
    public void push(char newData){
        //asumsi stack belum penuh
        data[++top] = newData;
    }
    
    public char pop(){
        //asumsi stack tidak kosong
        return data[top--];
    }
    
    public void display(){
        //asumsi stack tidak kosong
        for(int i=0;i<=top;i++){
            System.out.print(data[i]+" ");
        }
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFUll(){
        return top==size-1;
    }
    
    public void reset(){
        top = -1;//nilai top di set -1 seperti awal
    }
    
    public char peek(){
        return data[top];
    }
}

public class DasarStack {
    public static void main(String[] args) {
        MyStack my = new MyStack(6);
        my.push('A');
        my.push('B');
        my.push('C');
        my.pop();
        my.push('Z');
        
        //my.reset();
        my.push('S');
        my.display();
        System.out.println("\ndata paling atas : "+my.peek());
        
    }
}
