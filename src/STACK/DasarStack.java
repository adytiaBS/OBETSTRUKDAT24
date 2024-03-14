package STACK;
class MyStack{
    int size;
    int top;
    char[] data;

    public MyStack(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }
    
    public void push(char newData){
        data[++top] = newData;
    }
    
    public char pop(){
        return data[top--];
    }
    
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(data[i]+" ");
        }
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFUll(){
        return top==size;
    }
    
}

public class DasarStack {
    public static void main(String[] args) {
        MyStack my = new MyStack(6);
        my.push('A');
        my.push('B');
        my.push('C');
        my.pop();
        my.pop();
        my.pop();
        my.push('Z');
        
        System.out.println(my.isEmpty());
        my.display();
        
    }
}
