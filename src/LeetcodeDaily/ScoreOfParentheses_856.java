package LeetcodeDaily;

import java.util.Stack;

public class ScoreOfParentheses_856 {
    public static void main(String[] args) {
        String str = "()()";
        System.out.println(solve(str));
    }

    public static int solve(String s){
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(-1);
            }else{
                int temp = 0;
                int anst = 0;
                while (st.peek()!= -1){
                    temp+=st.pop();
                }
                anst += Math.max(2*temp,1);
                st.pop();
                st.push(anst);
                System.out.println(st);
            }
        }
        while (!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
