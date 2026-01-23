package CodeForcesDaily;

import java.io.*;
import java.util.*;

public class D {
    // fast token reader using BufferedReader + StringTokenizer
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream is) { br = new BufferedReader(new InputStreamReader(is)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = fs.nextInt();

            // positions for each required frequency x (1..n)
            ArrayList<Integer>[] pos = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) pos[i] = new ArrayList<>();
            for (int i = 0; i < n; i++) pos[b[i]].add(i);

            int[] a = new int[n];
            int curLabel = 1;
            boolean ok = true;

            for (int x = 1; x <= n; x++) {
                int cnt = pos[x].size();
                if (cnt == 0) continue;
                if (cnt % x != 0) { // cannot split into groups of size x
                    ok = false;
                    break;
                }
                // split pos[x] into chunks of size x and assign same label to each chunk
                for (int start = 0; start < cnt; start += x) {
                    for (int j = 0; j < x; j++) {
                        a[pos[x].get(start + j)] = curLabel;
                    }
                    curLabel++;
                }
            }

            if (!ok) out.append("-1\n");
            else {
                for (int i = 0; i < n; i++) out.append(a[i]).append(' ');
                out.append('\n');
            }
        }

        System.out.print(out.toString());
    }
}
