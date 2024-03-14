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
        if(!isFUll()){
            data[++top] = newData;
        }
    }
    
    public char pop(){
        char hasil;
        hasil = 's';
        if(!isEmpty()){
            hasil = data[top--];
        }
        return hasil;
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
        return top==size-1;
    }
    
}

public class DasarStack {
    public static void main(String[] args) {
        MyStack my = new MyStack(6);
        my.push('A');
        my.pop();
        my.pop();
        
        my.display();
        
    }
}
