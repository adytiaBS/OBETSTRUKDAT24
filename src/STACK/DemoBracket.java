package STACK;

class Bracket {

    String input;
    MyStack stack;

    public Bracket(String input) {
        this.input = input;
        stack = new MyStack(input.length());
    }

    public void check() {
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (!stack.isEmpty()) {
                    char chx = stack.pop();
                    if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                }
            }
        }
    }
}

    public class DemoBracket {

        public static void main(String[] args) {
            Bracket my = new Bracket("{([]{}))}");
            my.check();

        }
    }
