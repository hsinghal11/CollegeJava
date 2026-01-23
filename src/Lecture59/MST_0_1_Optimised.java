//package Lecture59;
//
//import java.util.*;
//
//public class MST_0_1_Optimised {
//    static TreeSet<Integer>[] map;
//    static HashSet<Integer> set;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        set = new HashSet<>();
//        int n = sc.nextInt();
//        map = new TreeSet[n+1];
//        int m = sc.nextInt();
//        if(m==0){
//            System.out.println(0);
//            return;
//        }
//        for(int i=1; i<=n; i++){
//            map.put(i, new TreeSet<>());
//            set.add(i);
//        }
//        for (int i = 1; i <= m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            map.get(a).add(b);
//            map.get(b).add(a);
//        }
//        int ans = 0;
//        for (int i = 1; i<= n; i++){
//            if(set.remove(i)){
//                ans++;
//                dfs(i);
//            }
//        }
//        System.out.println(ans-1);
//    }
//
//    private static void dfs(int i){
//        Stack<Integer> st = new Stack<>();
//        for(int x: set){
//            if(!map[i].contains(x)) {
//                st.push(x);
//            }
//        }
//
//        while (!st.isEmpty()){
//            int s = st.pop();
//            if(!set.contains(s)){
//                continue;
//            }
//            set.remove(s);
//            for(int x: set){
//                if(!map[i].contains(x)) {
//                    st.push(x);
//                }
//            }
//        }
//    }
//
//}
