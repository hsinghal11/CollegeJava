package Lecture28;

import java.util.Stack;

public class Stack_Add_Last {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);//add
        st.push(20);//add
        st.push(30);//add
        st.push(40);//add
        st.push(50);//add
        System.out.println(st);
        Add_Last(st,6);
        System.out.println(st);
    }

    private static void Add_Last(Stack<Integer> st, int i) {
        if(st.isEmpty()){
            st.push(i);
            return;
        }
        int x = st.pop();
        Add_Last(st,i);
        st.push(x);
    }

}
