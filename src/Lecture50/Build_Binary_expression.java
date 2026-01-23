package Lecture50;

import java.util.Stack;

public class Build_Binary_expression {
    static class Node {
        char val;
        Node left;
        Node right;

        Node(char val) {
            this.val = val;
        }
    }

    static class solution {
        public Node expTree(String s) {
            String PostFix = getPostFix(s);
            Stack<Node> st = new Stack<>();
            for (int i = 0; i < PostFix.length(); i++) {
                char ch = PostFix.charAt(i);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    Node nn = new Node(ch);
                    Node right = st.pop();
                    Node left = st.pop();
                    nn.right = right;
                    nn.left = left;
                    st.push(nn);
                } else {
                    st.push(new Node(ch));
                }
            }
            return st.peek();
        }

        public String getPostFix(String s) {
            StringBuilder sb = new StringBuilder();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    sb.append(ch);
                } else if (ch == '(') {
                    st.push(ch);
                } else if (ch == ')') {
                    while (st.peek() != '(') {
                        sb.append(st.pop());
                    }
                    st.pop();
                } else {
                    while (!st.isEmpty() && getValue(st.peek()) > getValue(ch)) {
                        sb.append(st.pop());
                    }
                    st.push(ch);
                }
            }
            return sb.toString();
        }

        public int getValue(char c) {
            if (c == '*' || c == '/') return 2;
            else if (c == '-' || c == '+') {
                return 1;
            } else return -1;
        }
    }
}
