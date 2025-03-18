package Lecture14;

import java.util.*;

public class BookAllocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int nos = sc.nextInt();
            int[] page = new int[n];
            for (int i = 0; i < n; i++) {
                page[i] = sc.nextInt();
            }
            System.out.println(MinimumPage(page, nos));
        }
    }

    public static int MinimumPage(int[] page, int nos) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for (int i = 0; i < page.length; i++) {
            high += page[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(page, nos, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] page, int nos, int mid) {
        int student = 1;
        int readPage = 0;
        int i = 0;
        while (i < page.length) {
            if (readPage + page[i] <= mid) {
                readPage += page[i];
                i++;
            } else {
                student++;
                readPage = 0;
            }
            if (student > nos) {
                return false;
            }
        }
        return true;
    }
}
