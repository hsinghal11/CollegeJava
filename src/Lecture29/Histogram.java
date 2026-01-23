package Lecture29;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(Largest_Histogram(arr));
    }

    public static int Largest_Histogram(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                if(st.isEmpty()){
                    max =  Math.max(max, h*i);
                }else{
                    max = Math.max(max, h*(i-st.peek()-1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.isEmpty()){
            int h = arr[st.pop()];

            if (st.isEmpty()) {
                max = Math.max(h * r, max);
            } else {
                int l = st.peek();
                int area = h * (r - l - 1);
                max = Math.max(area, max);
            }
        }
        return max;
    }
}
