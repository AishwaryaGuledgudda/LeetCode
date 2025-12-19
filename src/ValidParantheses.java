import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String s = "(([]))";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char parant=s.charAt(i);
            if(parant=='(' || parant=='[' || parant=='{'){
                stk.push(parant);
            } else if (parant==')'&& stk.peek()=='(') {
                stk.pop();
            }else if (parant==']'&& stk.peek()=='[') {
                stk.pop();
            }else if (parant=='}'&& stk.peek()=='{') {
                stk.pop();
            }else System.out.println("false");
        }
        if(stk.isEmpty()){
            System.out.println("True");
            //return true;
        } else System.out.println("false");
            //return false;

    }
}
