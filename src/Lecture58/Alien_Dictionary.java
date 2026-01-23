package Lecture58;

import java.util.*;

public class Alien_Dictionary {
    public String alienOrder(String[] words) {
        HashMap<Character, List<Character>> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                if (!map.containsKey(ch)) {
                    map.put(ch, new ArrayList<>());
                }
            }
        }

        // pick two words and compare to make topological order
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            // s1 = rajesh and r2 = raj -> but s2 is in s1 but s1.len is more not possible sorted
            if (s1.startsWith(s2) && s1.length() > s2.length()) {
                return "";
            }
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    map.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }
        // inDegree
        int[] in = new int[26];
        for (char ch : map.keySet()) {
            for (Character nbrs : map.get(ch)) {
                in[nbrs - 'a']++;
            }
        }
        Queue<Character> q = new LinkedList<>();
        for (char ch : map.keySet()) {
            if (in[ch - 'a'] == 0) {
                q.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            char ch = q.poll();
            sb.append(ch);
            for (char nbrs : map.get(ch)) {
                in[nbrs-'a']--;
                if (in[nbrs - 'a'] == 0) {
                    q.add(nbrs);
                }
            }
        }
        return sb.length() == map.size() ? sb.toString() : "";
    }

    public static void main(String[] args) {
        Alien_Dictionary n = new Alien_Dictionary();
        String[] s = {
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"};
        System.out.println(n.alienOrder(s));
    }
}
