package STACK;
class Reverse{
    MyStack data;
    String input, output;

    public Reverse(String input) {
        this.input = input;
        data = new MyStack(input.length());
        output = "";
    }
    
    public void setInput(String input){//method ubah input
        this.input = input;
    }
    public void doReverse(){
        //perulangan memasukan huruf ke stack
        for(int i=0; i<input.length(); i++){
            data.push(input.charAt(i));
        }
        
        //perulangan pop stack dan di masukkan ke output
        while(!data.isEmpty()){
            output += data.pop();
        }
        
        //menampilkan output
        System.out.println(output);
    }
    
}
public class DemoRevers {
    public static void main(String[] args) {
        Reverse my = new Reverse("belajar");
        my.setInput("arema");
        my.doReverse();
    }
}
