import java.util.Stack;

public class Problem150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String op = "+-/*";
        for (int i = 0 ; i < tokens.length ; i++) {
            if (op.indexOf(tokens[i]) == -1) st.push(Integer.parseInt(tokens[i])); //9
            else {
                int a = st.pop(); //3
                int b = st.pop(); //3
                char o = tokens[i].charAt(0); //* 
                switch (o) {
                    case '+': st.push(b + a);
                    break;
                    case '-': st.push(b - a);
                    break;
                    case '/': st.push(b / a);
                    break;
                    case '*': st.push(b * a);
                    break;
                }
            }
        }
        return st.pop();
    }
}
