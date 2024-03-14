package STACK;
class Reverse{
    MyStack data;
    String input, output;

    public Reverse(String input) {
        this.input = input;
        data = new MyStack(input.length());
        output = "";
    }
    
    public void doReverse(){
        for(int i=0; i<input.length(); i++){
            data.push(input.charAt(i));
        }
        
        while(!data.isEmpty()){
            output += data.pop();
        }
        
        System.out.println(output);
    }
    
}
public class DemoRevers {
    public static void main(String[] args) {
        Reverse my = new Reverse("belajar");
        my.doReverse();
    }
}
