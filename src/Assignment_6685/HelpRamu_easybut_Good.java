package Assignment_6685;

import java.util.Scanner;

public class HelpRamu_easybut_Good {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int noOfRiksha = sc.nextInt();
            int noOfCab = sc.nextInt();
            int[] rikshaUsed = new int[noOfRiksha];
            int[] cabUsed = new int[noOfCab];
            for (int i = 0; i < noOfRiksha; i++) {
                rikshaUsed[i] = sc.nextInt();
            }
            for (int i = 0; i < noOfCab; i++) {
                cabUsed[i] = sc.nextInt();
            }

            int costOfRishwa = 0;
            int costOfCab = 0;
            for (int i = 0; i < noOfRiksha; i++) {
                costOfRishwa += Math.min(rikshaUsed[i] * c1, c2);
            }
            costOfRishwa = Math.min(costOfRishwa, c3);

            for (int i = 0; i < noOfCab; i++) {
                costOfCab += Math.min(cabUsed[i] * c1, c2);
            }
            costOfCab = Math.min(costOfCab, c3);

            int toatalCoast = Math.min(costOfRishwa + costOfCab, c4);
            System.out.println(toatalCoast);
        }
    }
}
