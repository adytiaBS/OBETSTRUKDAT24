package STACK;
class Bracket{
    String input;
    MyStack data;

    public Bracket(String input) {
        this.input = input;
        data = new MyStack(input.length());
    }
    public void check(){
        char ch;
        for(int i=0; i<input.length(); i++){
            ch = input.charAt(i);
            if(ch == '{' || ch=='[' || ch=='('){
                data.push(ch);
            }
            
        }
    }
    
}
public class DemoBracket {
    
}
