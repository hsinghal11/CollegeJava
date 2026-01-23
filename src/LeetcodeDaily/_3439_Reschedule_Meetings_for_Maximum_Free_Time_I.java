package LeetcodeDaily;

import java.util.ArrayList;

public class _3439_Reschedule_Meetings_for_Maximum_Free_Time_I {
    public static void main(String[] args) {

    }
    public static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        ArrayList<Integer> freeTime = new ArrayList<>();
        freeTime.add(startTime[0]);
        for (int i = 1; i < startTime.length; i++) {
            freeTime.add(startTime[i]-endTime[i-1]);
        }
        freeTime.add(eventTime-endTime[endTime.length-1]);
        int n = freeTime.size();
        int currTime = 0;
        int maxTime = 0;
        int si = 0;
        int ei = 0;
        while (ei < n){
            currTime += freeTime.get(ei); // grow

            // Shrink
            while (ei-si+1 > k+1 && si<=ei){
                currTime -= freeTime.get(si);
                si++;
            }

            maxTime = Math.max(maxTime, currTime);
            ei++;
        }
        return maxTime;
    }
}
